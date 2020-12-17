package src.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;


public class Authorization {

    public static void main(String[] args) throws IOException {
        String client_id = "11212";
        String kid = "2121221"; // 登录信息中的 kid 字段
        String mac_key = "212111";  // 登录信息中的 mac_key 字段

        String method = "GET"; // GET or POST
        String request_url = "https://openapi.taptap.com/account/profile/v1?client_id=" + client_id; // 请求地址
        String authorization = getAuthorization(request_url, method, kid, mac_key);
        System.out.println(authorization);

        URL url = new URL(request_url);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        // 将该请求头带入Http请求头中发起请求
        conn.setRequestProperty("Authorization", authorization);
        conn.setRequestMethod("GET");

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder result = new StringBuilder();
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();

        System.out.println(result.toString());
    }

    /**
     * generate authorization string.<br>
     * <p>It will add to header by http request</p>
     *
     * @param request_url 请求地址
     * @param method      "GET" or "POST"
     * @param key_id      key id by OAuth 2.0
     * @param mac_key     mac key by OAuth 2.0
     * @return authorization string
     */
    public static String getAuthorization(String request_url, String method, String key_id, String
            mac_key) {

        try {
            URL url = new URL(request_url);
            String time = String.format(Locale.US, "%010d", System.currentTimeMillis() / 1000);
            String randomStr = getRandomString(5);
            String host = url.getHost();
            String uri = request_url.substring(request_url.lastIndexOf(host) + host.length());
            String port = "80";
            if (request_url.startsWith("https")) {
                port = "443";
            }
            String other = "";
            //System.out.println(host+"=="+uri+"===="+port);
            String sign = sign(mergeSign(time, randomStr, method, uri, host, port, other), mac_key);
            return "MAC " + getAuthorizationParam("id", key_id) + "," + getAuthorizationParam("ts", time)
                    + "," + getAuthorizationParam("nonce", randomStr) + "," + getAuthorizationParam("mac",
                    sign);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getRandomString(int length) { //length表示生成字符串的长度
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    private static String mergeSign(String time, String randomCode, String httpType, String uri,
                                    String domain, String port, String other) {
        if (time.isEmpty() || randomCode.isEmpty() || httpType.isEmpty() || domain.isEmpty() || port.isEmpty()) {
            return null;
        }

        String prefix =
                time + "\n" + randomCode + "\n" + httpType + "\n" + uri + "\n" + domain + "\n" + port
                        + "\n";

        if (other.isEmpty()) {
            prefix += "\n";
        } else {
            prefix += (other + "\n");
        }

        return prefix;
    }

    private static String sign(String signatureBaseString, String key) {
        try {
            SecretKeySpec signingKey = new SecretKeySpec(key.getBytes(), "HmacSHA1");

            Mac mac = Mac.getInstance("HmacSHA1");
            mac.init(signingKey);
            byte[] text = signatureBaseString.getBytes(StandardCharsets.UTF_8);
            byte[] signatureBytes = mac.doFinal(text);
            signatureBytes = Base64.getEncoder().encode(signatureBytes);
            return new String(signatureBytes, StandardCharsets.UTF_8);
        } catch (NoSuchAlgorithmException | InvalidKeyException e) {
            throw new IllegalStateException(e);
        }
    }

    private static String getAuthorizationParam(String key, String value) {
        if (key.isEmpty() || value.isEmpty()) {
            return null;
        }
        return key + "=" + "\"" + value + "\"";
    }
}
