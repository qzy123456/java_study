import java.util.*;
public class ForSentence2 {
     public static void main(String[] args) {
         int s = 0 ,n = 0;
         System.out.println("请输入第一个数字：");
         Scanner sc = new Scanner(System.in);
         n = sc.nextInt();
         for (int a=0; a<= n; a += 1){
              s += a;
         }
         System.out.println("从0到" + n + "的和为" + s);
     }
 }