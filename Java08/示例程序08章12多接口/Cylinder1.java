package Java08.示例程序08章12多接口;

interface Face1{
	 double pi=3.14;
	 abstract double area();
}
interface Face2{
	abstract void setColur(String c);
}

interface Face3 extends Face1, Face2{
	abstract void volume();
}

public class Cylinder1 implements Face3{
	private double radius;
	private int height;
	protected String color;
	public Cylinder1(double r,int h){
		radius=r;
		height=h;		
	}
	public double area(){
		return pi*radius*radius;
	}
	public void volume(){
		System.out.println("�����:"+area()*height);
	}
	public void setcolor(String c){
		color=c;
	}
	public static void main(String[] args){
		Cylinder1 volu=new Cylinder1(5.0,2);
		volu.setcolor("red");
		volu.volume();
	}

	@Override
	public void setColur(String c) {

	}
}

