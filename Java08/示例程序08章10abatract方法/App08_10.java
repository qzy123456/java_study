package Java08.示例程序08章10abatract方法;

abstract class Shape{  //���������Shape
	protected String name;  //�����ܱ����ַ�������name
	public Shape(String xm){  //���庬��һ���������๹�췽��
		name=xm;
		System.out.print("���ƣ�"+xm);
	}
	abstract public double getArea();    //�������󷽷�getArea()
	abstract public double getLength(); //�������󷽷�getLength()
}


class Circle extends Shape{  //����Shape������Circle
	private double pi=3.14;  //����˽������pi
	private double radius;   //����˽������radius
	public Circle(String shapeName, double r){  //����Circle��Ĺ��췽��
		super(shapeName);
		radius=r;
	}
	public double getArea(){  //ʵ�ֳ������getArea()����,�����
		return pi*radius*radius;
	}
	
	public double getLength(){  //ʵ�ֳ������getLength()���������ܳ�
		return 2*pi*radius;
	}
}

 class Rectangle extends Shape{ //���嶨��Shape������Rectange
		private double width, height;  //����˽������ width, height
		public Rectangle(String shapeName, double width, double height){
			super(shapeName);
			this.width=width;
			this.height=height;			
		}
		
		public double getArea(){  //ʵ�ֳ������getArea()����
			return width*height;
		}
		public double getLength(){  //ʵ�ֳ������getLength()����
			return 2*(width+height);
		}
	}

public class App08_10 {
	public static void main(String[] args) {
       
//		Shape s1=new Shape(); //�޷�����������ʵ��
		
		Rectangle rec=new Rectangle("������",6.5,10.3); //���������Ͷ���rec��ָ������
       System.out.print(";���="+rec.getArea());
       System.out.println(";�ܳ�="+rec.getLength());
       
       Shape cir=new Circle("Բ��",10.2);  //���������Ͷ���cir��ָ������
       System.out.print(";���="+cir.getArea());
       System.out.print(";�ܳ�="+cir.getLength());

	}

}
