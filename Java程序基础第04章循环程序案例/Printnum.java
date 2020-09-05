package 第04章循环程序案例;
public class Printnum {
    public static void main (String args[]) {
    	  int i=1;
          for (   i=1; i <= 10; i =i+1) {      // 定义for循环

             System.out.println("当前的数是："+ i) ; //  循环体打印数据
             i++;
            }
        System.out.println("打印完毕" );
    }
}
