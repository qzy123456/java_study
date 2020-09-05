package Java08.示例程序08章11接口定义及使用;

interface IShape{   //����ӿ�
	final double pi=3.14;
	abstract double getArea();
	abstract double getLength();
}

interface A_able{
	abstract double getA();
}

class Rectangle implements IShape{  //����ӿ�Shape��ʵ���� Rectangle
	int width,length;	
	public Rectangle(int newwidth,int newlength){ //���幹�췽��
		width=newwidth;
		length=newlength;
	}	
	public double getArea(){ //ʵ�ֳ��󷽷�Area()
		double ls_area=width*length;
		return ls_area;
	}
	public double getLength(){ //ʵ�ֳ��󷽷�Area()
		return 2*(width*length);
	}
}

class Circle implements IShape{ //����ӿ�Shape��ʵ���� Circle
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
		
		System.out.println("Բ������ǣ�"+cir.getArea());
		System.out.println("Բ���ܳ��ǣ�"+cir.getLength());
		
		System.out.println("���ε�����ǣ�"+rec.getArea());
		System.out.println("���ε��ܳ��ǣ�"+rec.getLength());
	}
}
