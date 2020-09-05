package 示例程序08章05person5上转型;
class Person{
	protected String name;  //设置保护属性name
	protected int age;      //设置保护属性age

	public Person(String name, int age){      //定义有2个参数的构造方法
		this.name=name;
		this.age=age;
	}
	
	protected void show(){  //定义Person类的show（）方法
		System.out.println("姓名:"+name+"年龄："+age);
	}
}
//定义子类Student
class Student extends Person{
	private String department; //设置私有属性departmen
	
	public Student(String xm, int age, String dep){ //定义有2个参数的构造方法
		super(xm,age);
		department=dep;		
	}
	protected void show(){ //定义Student类的show（）方法
		System.out.println("系别"+department);
	}
	protected void subshow(){ //定义Student类的show（）方法
		System.out.println("我在子类中。");
	}
}

//包含主方法的公共类
public class App8_5 {
	public static void main(String[] args) {
	   	
	  Person per=new Student("王永涛", 24,"电子");  //生成父类变量per指向子类对象
	  per.show();	     //利用父类对象Per调用show()方法
	  
	}
}

