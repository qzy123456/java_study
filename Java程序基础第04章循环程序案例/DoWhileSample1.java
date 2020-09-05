package 第04章循环程序案例;

import java.util.Scanner;
public class DoWhileSample1 {
public static void main(String[] args) {
	int data;
	Scanner input=new Scanner(System.in);
	do {
		  System.out.println("输入一个数据,系统会打印出来(输入0程序会停止执行)。");
		  data=input.nextInt();
		  System.out.println("用户输入的数据是:"+data);
		}while(data!=0); 
	
	System.out.println("用户输入完毕。");
	}
}
