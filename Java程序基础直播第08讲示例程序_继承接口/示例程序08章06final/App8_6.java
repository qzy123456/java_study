package ʾ������08��06final;
class AAA{
	static final double pi=3.14;
	public final void show(){
		System.out.println("pi="+pi);
	}
}
class BBB extends AAA{
	private int num=100;
	public void show(){  //����BBB���show()������������ִ���
		                 //��Ϊ��������ͬ���ķ���������final���ͣ���������
		System.out.println("num="+num);
	}
}
public class App8_6 {
	
	public static void main(String[] args) {
		BBB ex=new BBB();
		ex.show();
	}

}
