 import java.util.*;
 public class IFSentence {
     public static void main(String[] args) {
         int a = 0 ,b= 0 ,c = 0 ,max = 0;
         System.out.println("请输入第一个数字：");
         Scanner sc = new Scanner(System.in);
          a = sc.nextInt();
         System.out.println("请输入第2个数字：");
          b = sc.nextInt();
         System.out.println("请输入第三个数字：");
          c = sc.nextInt();
         int temp=a>b?a:b;
          max=temp>c?temp:c;
         System.out.println("最大数为：" + max);
     }
 }