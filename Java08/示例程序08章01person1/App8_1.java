package Java08.示例程序08章01person1;

class Person{
	private String name;  //����˽������name
	private int age;      //����˽������age
	public Person(){      //�����޲����Ĺ��췽��
		System.out.println("�����˸����๹�췽��Persons()");
	}
	public void setNameAge(String name, int age){ //����setNameAge��������
		this.name=name;
		this.age=age;
	}
	public void show(){  //����show��������
		System.out.println("����:"+name+"���䣺"+age);
	}
}
//��������Student
class Student extends Person{
	private String department; //����˽������departmen
	
	public Student(){          //�����޲����Ĺ��췽��
		System.out.println("�����˸�student�๹�췽��Student()");
	}
	public void setDepartment(String dep){ //����setDepartment����
		department=dep;
		System.out.println("����"+department+"��ѧ��");
	}
}

//�����������Ĺ�����
public class App8_1 {
	public static void main(String[] args) {
		Student stu=new Student();  //����Student���һ��ʵ��stu
		stu.setNameAge("��һ", 21);   //stu���ø����setNameAge()����
		stu.show();                  //stu���ø����show()����
		stu.setDepartment("�����ϵ");  //stu����setDepartment()����		
	}
}

