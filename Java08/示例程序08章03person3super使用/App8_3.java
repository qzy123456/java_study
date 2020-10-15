package Java08.示例程序08章03person3super使用;

class Personss{
	protected String name;  //���ñ�������name
	protected int age;      //���ñ�������age
	public Personss(){      //�����޲����Ĺ��췽��
			}
	
	public Personss(String name, int age){      //�����޲����Ĺ��췽��
		this.name=name;
		this.age=age;
		System.out.println("�����˸����๹�췽��Persons(String name, int age)");
	}
	
	public void show(){  //����show��������
		System.out.println("����:"+name+",���䣺"+age);
	}
}
//��������Student
class Students extends Personss {
	private String department; //����˽������departmen
	int age=20;  //�����һ���븸��ĳ�Ա��ͬ����age�ĳɻ�Ա����
		
	public Students(String xm, String dep){ //������2�������Ĺ��췽��
		name=xm;
		department=dep;
		super.age=25;  
		System.out.println("�����Ա����age="+age);
		super.show();
		System.out.println("ϵ��:"+department);
	}
		
}

//�����������Ĺ�����
public class App8_3 {
	public static void main(String[] args) {
	Students stu=new Students("�Ŷ�", "�����ϵ");  //����Student���һ��ʵ��stu
					
	}

}


