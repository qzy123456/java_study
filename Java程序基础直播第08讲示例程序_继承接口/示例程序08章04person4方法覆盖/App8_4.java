package 示例程序08章04person4方法覆盖;

class Person{
	protected String name;  //设置保护属性name
	protected int age;      //设置保护属性age
	public Person(){      //定义无参数的构造方法
			}
	
	public Person(String name, int age){      //定义有2个参数的构造方法
		this.name=name;
		this.age=age;
		System.out.println("调用了个人类构造方法Person(String name, int age)");
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
		
}

//包含主方法的公共类
public class App8_4 {
	public static void main(String[] args) {
		
	  Student stu=new Student("张二", 24,"计算机系");  //生成Student类的一个实例stu
	  stu.show();	
		
	}

}


