package 汽车类;
class Car{  //定义一个汽车类Car
	String color; //汽车颜色
	String id;    //汽车号码
	int product_year; //汽车生产年
	
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
		System.out.println("我的号码是："+id+",我的颜色是"+color+"的,我是"+product_year+"年生产的。");
	}
	
}
///包含主方法的类CarManage
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
