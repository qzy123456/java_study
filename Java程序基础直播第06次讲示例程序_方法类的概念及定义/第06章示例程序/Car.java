package 第06章示例程序;

public class Car {
   String color;
   String id;
   int product_year;
   
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
		System.out.print("车牌号码是："+id+",汽车颜色是："+color+",生产日期是："+product_year);
	}
	
}
