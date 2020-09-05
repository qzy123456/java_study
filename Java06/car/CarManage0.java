package Java06.car;
class Car0{  //����һ��������Car0
	String color; //������ɫ
	String id;    //��������
	int product_year; //����������
	
	public void print(){
		System.out.println("�ҵĺ����ǣ�"+id+",�ҵ���ɫ��"+color+"��," +
				"����"+product_year+"�������ġ�");
	}
	
}

public class CarManage0 {
	public static void main(String[] args) {
	Car0 car1=new Car0();
	car1.color="red";
	car1.id="No0001";
	car1.product_year=2010;
	car1.print();
	
	Car0 car2=new Car0();
	car2.color="white";
	car2.id="No0006";
	car2.product_year=2011;
	car2.print();
	
  }
}
