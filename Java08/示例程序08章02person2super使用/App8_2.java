package Java08.示例程序08章02person2super使用;

class Person{
	private String name;  //����˽������name
	private int age;      //����˽������age
	public Person(){      //�����޲����Ĺ��췽��
		System.out.println("������Persons�๹�췽��Persons()");
	}
	
	public Person(String name, int age){      //�����޲����Ĺ��췽��
		this.name=name;
		this.age=age;
		System.out.println("�����˸����๹�췽��Persons(String name, int age)");
	}
	
	public void setNameAge(String name, int age){ //����setNameAge��������
		this.name=name;
		this.age=age;
	}
	public void show(){  //����show��������
		System.out.println("����:"+name+",���䣺"+age);
	}
}
//��������Student
class Student extends Person{
	private String department; //����˽������departmen
	public Student(){          //�����޲����Ĺ��췽��
		System.out.println("�����˸�student�๹�췽��Student()");
	}
	
	public Student(String name, int age, String dep){ //������3�������Ĺ��췽��
		super(name, age); //���ø������2�������Ĺ��췽��
		department=dep;
		System.out.println("����"+department+"��ѧ��");
		System.out.println("�����˸�student�๹�췽��Student(String name, int age, String dep)");
	}
	
	public void setDepartment(String dep){ //����setDepartment����
		department=dep;
		System.out.println("����"+department+"��ѧ��");
	}
}

//�����������Ĺ�����
public class App8_2 {
	public static void main(String[] args) {
		Student stu1=new Student();  //����Student���һ��ʵ��stu1
		Student stu2=new Student("��С��", 23,"��Ϣϵ");  //����Student���һ��ʵ��stu2
		
		stu1.show();   //stu1���ø����show()����
		stu2.show();  //stu2���ø����show()����				
		
	}

}

