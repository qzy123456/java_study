package Java08.示例程序08章05person5上转型;

class Person{
	protected String name;  //���ñ�������name
	protected int age;      //���ñ�������age

	public Person(String name, int age){      //������2�������Ĺ��췽��
		this.name=name;
		this.age=age;
	}
	
	protected void show(){  //����Person���show��������
		System.out.println("����:"+name+"���䣺"+age);
	}
}
//��������Student
class Student extends Person{
	private String department; //����˽������departmen
	
	public Student(String xm, int age, String dep){ //������2�������Ĺ��췽��
		super(xm,age);
		department=dep;		
	}
	protected void show(){ //����Student���show��������
		System.out.println("ϵ��"+department);
	}
	protected void subshow(){ //����Student���show��������
		System.out.println("���������С�");
	}
}

//�����������Ĺ�����
public class App8_5 {
	public static void main(String[] args) {
	   	
	  Person per=new Student("������", 24,"����");  //���ɸ������perָ���������
	  per.show();	     //���ø������Per����show()����
	  
	}
}

