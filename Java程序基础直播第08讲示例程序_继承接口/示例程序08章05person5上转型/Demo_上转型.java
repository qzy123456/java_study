package ʾ������08��05person5��ת��;

class Animal{
	protected String name;
	public void show(){
		System.out.println("1");
	}
}

class Fish extends Animal{
	protected String color;
	public void show(){
		System.out.println("2");
	}
}

public class Demo_��ת�� {
	public static void main(String[] args) {
//		Animal f1=new Fish();
//		f1.show();
//		
//		System.out.print(f1 instanceof Animal);	 
		
		Fish a1=(Fish)new Animal();
		a1.show();
	}
}
