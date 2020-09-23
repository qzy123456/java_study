public class StringB {
    public static void main(String[] args) {
        String a = "This is stringa";
        String b = "This is stringb";

        String str = a.concat(b);
        System.out.println("字符串拼接str " + str); //拼接

        int result = b.compareTo( a );
        System.out.println("字符串b比较a " + result); //字符串比较

        int len = a.length();
        System.out.println("字符串a的长度 " + len); //字符串a的长度

        System.out.println("字符串a转换大写 " + a.toUpperCase()); //字符串a转换大写

        System.out.println("字符串b转换小写 " + b.toLowerCase()); //字符串b转换小写
    }
}