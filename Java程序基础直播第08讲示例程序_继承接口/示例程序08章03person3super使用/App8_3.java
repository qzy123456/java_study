package 示例程序08章03person3super使用;
class Person{
	protected String name;  //设置保护属性name
	protected int age;      //设置保护属性age
	public Person(){      //定义无参数的构造方法
			}
	
	public Person(String name, int age){      //定义无参数的构造方法
		this.name=name;
		this.age=age;
		System.out.println("调用了个人类构造方法Person(String name, int age)");
	}
	
	public void show(){  //定义show（）方法
		System.out.println("姓名:"+name+",年龄："+age);
	}
}
//定义子类Student
class Student extends Person{
	private String department; //设置私有属性departmen
	int age=20;  //添加了一个与父类的成员相同名字age的成会员变量
		
	public Student(String xm, String dep){ //定义有2个参数的构造方法
		name=xm;
		department=dep;
		super.age=25;  
		System.out.println("子类成员变量age="+age);
		super.show();
		System.out.println("系别:"+department);
	}
		
}

//包含主方法的公共类
public class App8_3 {
	public static void main(String[] args) {
	Student stu=new Student("张二", "计算机系");  //生成Student类的一个实例stu
					
	}

}


