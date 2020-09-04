package 示例程序08章01person1;

class Person{
	private String name;  //设置私有属性name
	private int age;      //设置私有属性age
	public Person(){      //定义无参数的构造方法
		System.out.println("调用了个人类构造方法Person()");
	}
	public void setNameAge(String name, int age){ //定义setNameAge（）方法
		this.name=name;
		this.age=age;
	}
	public void show(){  //定义show（）方法
		System.out.println("姓名:"+name+"年龄："+age);
	}
}
//定义子类Student
class Student extends Person{
	private String department; //设置私有属性departmen
	
	public Student(){          //定义无参数的构造方法
		System.out.println("调用了个student类构造方法Student()");
	}
	public void setDepartment(String dep){ //定义setDepartment方法
		department=dep;
		System.out.println("我是"+department+"的学生");
	}
}

//包含主方法的公共类
public class App8_1 {
	public static void main(String[] args) {
		Student stu=new Student();  //生成Student类的一个实例stu
		stu.setNameAge("张一", 21);   //stu调用父类的setNameAge()方法
		stu.show();                  //stu调用父类的show()方法
		stu.setDepartment("计算机系");  //stu调用setDepartment()方法		
	}
}

