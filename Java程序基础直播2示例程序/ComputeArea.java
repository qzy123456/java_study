import java.math.*;
public class ComputeArea {  //定义类              
	 	 
	 public static void main(String[] args) { 
		final double PI = 3.14159 ;   
	    double radius;     //定义变量，保存半径信息                    
	    double area;       //定义变量，保存面积信息                      
	    radius = 10;       //对半径变量赋值
        area = radius * radius * PI;  //计算圆的面积            
	    
        long area2;
        area2 = Math.round(radius * radius * PI);  //计算圆的面积   
        
	    System.out.println("半径:" + radius + " : " + area2); //打印结果
	       
	  }	
	 
}