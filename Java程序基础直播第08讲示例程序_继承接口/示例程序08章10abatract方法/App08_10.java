package 示例程序08章10abatract方法;
abstract class Shape{  //定义抽象类Shape
	protected String name;  //定义受保护字符串属性name
	public Shape(String xm){  //定义含有一个参数的类构造方法
		name=xm;
		System.out.print("名称："+xm);
	}
	abstract public double getArea();    //声明抽象方法getArea()
	abstract public double getLength(); //声明抽象方法getLength()
}


class Circle extends Shape{  //定义Shape的子类Circle
	private double pi=3.14;  //定义私有属性pi
	private double radius;   //定义私有属性radius
	public Circle(String shapeName, double r){  //定义Circle类的构造方法
		super(shapeName);
		radius=r;
	}
	public double getArea(){  //实现抽象类的getArea()方法,求面积
		return pi*radius*radius;
	}
	
	public double getLength(){  //实现抽象类的getLength()方法，求周长
		return 2*pi*radius;
	}
}

 class Rectangle extends Shape{ //定义定义Shape的子类Rectange
		private double width, height;  //定义私有属性 width, height
		public Rectangle(String shapeName, double width, double height){
			super(shapeName);
			this.width=width;
			this.height=height;			
		}
		
		public double getArea(){  //实现抽象类的getArea()方法
			return width*height;
		}
		public double getLength(){  //实现抽象类的getLength()方法
			return 2*(width+height);
		}
	}

public class App08_10 {
	public static void main(String[] args) {
       
//		Shape s1=new Shape(); //无法创建抽象类实例
		
		Rectangle rec=new Rectangle("长方形",6.5,10.3); //声明父类型对象rec，指向子类
       System.out.print(";面积="+rec.getArea());
       System.out.println(";周长="+rec.getLength());
       
       Shape cir=new Circle("圆形",10.2);  //声明父类型对象cir，指向子类
       System.out.print(";面积="+cir.getArea());
       System.out.print(";周长="+cir.getLength());

	}

}
