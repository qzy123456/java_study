import java.util.Scanner;       //导入Java类包
public class ComputeAreaInput {    
	 	 
	 public static void main(String[] args) { 
		final double PI = 3.14159 ;	 
	    double radius;     //定义变量，保存半径信息                    
	    double area;       //定义变量，保存面积信息                     
	   
	    System.out.print("请输入圆的半径：");
	   	Scanner reader=new Scanner(System.in);
	    radius=reader.nextDouble();
	    
	    area = radius * radius * PI;  //计算圆的面积            
	    System.out.println("半径:" + radius + " : " + area); //打印结果	       
	  }	 
}