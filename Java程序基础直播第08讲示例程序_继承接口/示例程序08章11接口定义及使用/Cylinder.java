package ʾ������08��11�ӿڶ��弰ʹ��;
interface Face1{
	 double pi=3.14;
	 abstract double area();
	
}
interface Face2{
	abstract void volume();
}
public class Cylinder implements Face1,Face2{

	private double radius;
	private int height;
	public Cylinder(double r,int h){
		radius=r;
		height=h;		
	}
	public double area(){
		return pi*radius*radius;
	}
	public void volume(){
		System.out.println("�����:"+area()*height);
	}
	public static void main(String[] args){
		Cylinder volu=new Cylinder(5.0,2);
		volu.volume();
	}
}
