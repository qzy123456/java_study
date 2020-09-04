package 汽车类;
class Car0{  //定义一个汽车类Car0
	String color; //汽车颜色
	String id;    //汽车号码
	int product_year; //汽车生产年
	
	public void print(){
		System.out.println("我的号码是："+id+",我的颜色是"+color+"的," +
				"我是"+product_year+"年生产的。");
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
