public class Arithmetic1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int s = 0;
        s = a % b; //取余
        System.out.println("a%b=" + s);
        a = a++;   //自增
        b = b--;   //自减
        s = ++a + --b;
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("s=" + s);
    }
}