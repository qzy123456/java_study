import java.math.*;
public class ComputeArea取整 {  //定义类              
	 	 
	 public static void main(String[] args) { 
		final double PI = 3.14159 ;   
	    double radius;     //定义变量，保存半径信息                    
	    long area;         //定义变量，保存面积信息                      
	    radius = 10.0;     //对半径变量赋值
     
	    area = (long)(radius * radius * PI);  //计算圆的面积并取整  
//        area = Math.round(radius * radius * PI);  //计算圆的面积,使用Math.round方法并取整  
        
	    System.out.println("半径:" + radius + " : " + area); //打印结果
	       
	  }	
	 
}