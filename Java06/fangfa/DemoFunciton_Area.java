package Java06.fangfa;

public class DemoFunciton_Area {
	
	public static double getArea( double radius){
	     double area;
	     area= 3.14*radius*radius;
	     return area;
	 }

	public static void main(String[] args) {
		double radius1=3.0;
		double area1=3.14*radius1*radius1;
		System.out.println("���2="+area1);

		double radius2=7.0;
		double area2=3.14*radius2*radius2;
		System.out.println("���2="+area2);

		double radius3=10.0;
		double area3=3.14*radius3*radius3;
		System.out.println("���3="+area3);
		
		
		///----�����ĵ���--------------------
		
		double area4=getArea(13.0);//���ü������������ֱ�Ӹ�������
		System.out.println("���3="+area4);	
		
		double radius4=11.0;
		double area5=getArea(radius4); //���ü���������������ñ�����ֵ����
		System.out.println("���3="+area5);		
		}

}
