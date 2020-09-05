package Java08.示例程序08章04person4方法覆盖;

class Person{
	protected String name;  //���ñ�������name
	protected int age;      //���ñ�������age
	public Person(){      //�����޲����Ĺ��췽��
			}
	
	public Person(String name, int age){      //������2�������Ĺ��췽��
		this.name=name;
		this.age=age;
		System.out.println("�����˸����๹�췽��Person(String name, int age)");
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
		
}

//�����������Ĺ�����
public class App8_4 {
	public static void main(String[] args) {
		
	  Student stu=new Student("�Ŷ�", 24,"�����ϵ");  //����Student���һ��ʵ��stu
	  stu.show();	
		
	}

}


