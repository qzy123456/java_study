package 示例程序08章11接口定义及使用;
interface IShape{   //定义接口
	final double pi=3.14;
	abstract double getArea();
	abstract double getLength();
}

interface A_able{
	abstract double getA();
}

class Rectangle implements IShape{  //定义接口Shape的实现类 Rectangle
	int width,length;	
	public Rectangle(int newwidth,int newlength){ //定义构造方法
		width=newwidth;
		length=newlength;
	}	
	public double getArea(){ //实现抽象方法Area()
		double ls_area=width*length;
		return ls_area;
	}
	double getLength(){ //实现抽象方法Area()
		return 2*(width*length);
	}
}

class Circle implements IShape{ //定义接口Shape的实现类 Circle
	private double r;
	public Circle(double newr){
		this.r=newr;
	}	
	public double getArea(){
		double ls_area=r*r*3.14;
		return ls_area;
	}
	public double getLength(){
		return 2*r*pi;
	}
}

public class App08_11 {
	public static void main(String[] args) {
		IShape cir=new Circle(5.0);
		IShape rec=new Rectangle(3,4);
		
		System.out.println("圆的面积是："+cir.getArea());
		System.out.println("圆的周长是："+cir.getLength());
		
		System.out.println("矩形的面积是："+rec.getArea());
		System.out.println("矩形的周长是："+rec.getLength());
	}
}
