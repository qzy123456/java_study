package 第04章循环程序案例;
import java.util.Scanner;
public class MenuSample {
	public static void main(String[] args) {
		int choice;
		Scanner input=new Scanner(System.in);
		do {
			  System.out.println("请选择商品 1:可乐,2:果汁,3:绿茶,0:退出");
			  choice=input.nextInt();
			  switch (choice){ //使用switch结构打印用户的选择结果
				  case 1:
					  System.out.println("用户选择了一瓶可乐");
					  break;
				  case 2:
					  System.out.println("用户选择了一瓶果汁");
					  break;
				  case 3:
					  System.out.println("用户选择了一瓶绿茶");
					  break;
			  }	//end switch  
			  
			}while(choice!=0); 
		
		System.out.println("用户输入完毕。");
		}
}

