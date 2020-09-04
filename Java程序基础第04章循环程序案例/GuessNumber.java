package 第04章循环程序案例;
import java.util.*;
/**
  * 本程序是一个数字猜测游戏使用while循环实现，其中random()方法产生随机数 
 */
public class GuessNumber {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		Scanner sc=new Scanner(System.in);
		System.out.println("请写猜测一个0~100之内的数字");
	    
		int guess=-1;
		while(guess!=number){
			System.out.println("请输入你的猜测:");
			guess=sc.nextInt();
			if (guess==number){
				System.out.println("猜测的值是正确的");
			}
			else if (guess>number)
				System.out.println("猜测的值大了");
			   else
			    System.out.println("猜测的值小了");
		}
		 
	}
}
