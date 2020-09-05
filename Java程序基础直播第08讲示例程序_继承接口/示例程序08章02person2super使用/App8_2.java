package 示例程序08章02person2super使用;
 
class Person{
	private String name;  //设置私有属性name
	private int age;      //设置私有属性age
	public Person(){      //定义无参数的构造方法
		System.out.println("调用了Person类构造方法Person()");
	}
	
	public Person(String name, int age){      //定义无参数的构造方法
		this.name=name;
		this.age=age;
		System.out.println("调用了个人类构造方法Person(String name, int age)");
	}
	
	public void setNameAge(String name, int age){ //定义setNameAge（）方法
		this.name=name;
		this.age=age;
	}
	public void show(){  //定义show（）方法
		System.out.println("姓名:"+name+",年龄："+age);
	}
}
//定义子类Student
class Student extends Person{
	private String department; //设置私有属性departmen
	public Student(){          //定义无参数的构造方法
		System.out.println("调用了个student类构造方法Student()");
	}
	
	public Student(String name, int age, String dep){ //定义有3个参数的构造方法
		super(name, age); //调用父类的有2个参数的构造方法
		department=dep;
		System.out.println("我是"+department+"的学生");
		System.out.println("调用了个student类构造方法Student(String name, int age, String dep)");
	}
	
	public void setDepartment(String dep){ //定义setDepartment方法
		department=dep;
		System.out.println("我是"+department+"的学生");
	}
}

//包含主方法的公共类
public class App8_2 {
	public static void main(String[] args) {
		Student stu1=new Student();  //生成Student类的一个实例stu1
		Student stu2=new Student("李小四", 23,"信息系");  //生成Student类的一个实例stu2
		
		stu1.show();   //stu1调用父类的show()方法
		stu2.show();  //stu2调用父类的show()方法				
		
	}

}

