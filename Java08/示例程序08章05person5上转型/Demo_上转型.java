package Java08.示例程序08章05person5上转型;

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

class Demo_上传型{
	public static void main(String[] args) {
//		Animal f1=new Fish();
//		f1.show();
//		
//		System.out.print(f1 instanceof Animal);	 
		
		Fish a1=(Fish)new Animal();
		a1.show();
	}
}
