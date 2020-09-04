package 方法;

public class DemoFunciton_Area {
	
	public static double getArea( double radius){
	     double area;
	     area= 3.14*radius*radius;
	     return area;
	 }

	public static void main(String[] args) {
		double radius1=3.0;
		double area1=3.14*radius1*radius1;
		System.out.println("面积2="+area1);

		double radius2=7.0;
		double area2=3.14*radius2*radius2;
		System.out.println("面积2="+area2);

		double radius3=10.0;
		double area3=3.14*radius3*radius3;
		System.out.println("面积3="+area3);
		
		
		///----方法的调用--------------------
		
		double area4=getArea(13.0);//调用计算面积方法，直接给定参数
		System.out.println("面积3="+area4);	
		
		double radius4=11.0;
		double area5=getArea(radius4); //调用计算面积方法，利用变量赋值参数
		System.out.println("面积3="+area5);		
		}

}
