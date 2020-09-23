import java.util.*;
public class WhileSentence {
     public static void main(String[] args) {
         int s = 0 ,a = 0 ,i = 1;
         System.out.println("请输入一个50-100的数字：");
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         while( a < 50 || a > 100){
             System.out.println("请输入一个50-100的数字：");
              sc = new Scanner(System.in);
             a = sc.nextInt();
         }
         System.out.println("您输入的数字为：" + a);
         i = a;
         while( a > 0){
             s += a;
             a -= 1;
         }
         System.out.println("1+2+3+...+" + i + "=" + s);
     }
 }
