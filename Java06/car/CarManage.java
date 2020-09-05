package Java06.car;
class Car{  //����һ��������Car
	String color; //������ɫ
	String id;    //��������
	int product_year; //����������
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getProduct_year() {
		return product_year;
	}
	public void setProduct_year(int product_year) {
		this.product_year = product_year;
	}
	
	public void print(){
		System.out.println("�ҵĺ����ǣ�"+id+",�ҵ���ɫ��"+color+"��,����"+product_year+"�������ġ�");
	}
	
}
///��������������CarManage
public class CarManage {
	public static void main(String[] args) {
		Car car1=new Car();
		car1.setColor("red");
		car1.setId("No0001");
		car1.setProduct_year(2010);
		car1.print();
		
		Car car2=new Car();
		car2.setColor("white");
		car2.setId("No0006");
		car2.setProduct_year(2011);
		car2.print();
	}

}
