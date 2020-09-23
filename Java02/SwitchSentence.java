import java.util.*;
public class SwitchSentence {
     public static void main(String[] args) {
         int a = -1;
         System.out.println("请输入一个0-6的数字：");
         Scanner sc = new Scanner(System.in);
         a = sc.nextInt();
         switch(a)
         {
             case 0 :
                 System.out.println("今天是周日");
                 break;
             case 1 :
                 System.out.println("今天是周1");
                 break;
             case 2 :
                 System.out.println("今天是周2");
                 break;
             case 3 :
                 System.out.println("今天是周3");
                 break;
             case 4 :
                 System.out.println("今天是周4");
                 break;
             case 5 :
                 System.out.println("今天是周5");
                 break;
             case 6 :
                 System.out.println("今天是周6");
                 break;
             default :
                 System.out.println("不知道今天周几");
         }
     }
 }