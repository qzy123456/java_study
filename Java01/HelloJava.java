import java.net.InetAddress;
import java.net.UnknownHostException;

public class HelloJava {
    public static void main(String[] args) throws UnknownHostException {

        System.out.println("欢迎 20202310820010 齐朝阳 同学学习Java课程!");
        System.setProperty("java.net.preferIPv6Addresses","true");
        InetAddress address  = InetAddress.getLocalHost();
        System.out.println(address.getAddress());
        System.out.println(address.getHostName());
    }
}
