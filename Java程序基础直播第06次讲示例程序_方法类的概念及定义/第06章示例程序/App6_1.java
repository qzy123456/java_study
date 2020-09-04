package 第06章示例程序;
class Cylinder{
	double radius;
	int height;
	double pi=3.14;
	double area() {
		System.out.println("底面积是："+pi*radius*radius);
		return pi*radius*radius;
	}
	 double volume(int ls_height) {
		if (ls_height<0) {
			return 0;
		}else
		{
			height=ls_height;
			return (pi*radius*radius)*ls_height ;
			} 
	}
	 
	 //方法的多态，相同volumn（）方法求体积 ，参数不一样
	 double volume() {
			return area()*height ;				
		}
	
	 
}
public class App6_1 {
	
	public static void main(String[] args) {
		Cylinder volu;
		volu=new Cylinder();
		volu.radius=2.8;
		volu.height=5;
		volu.pi=5.2;
		volu.area();
        System.out.println("volu体积是："+volu.volume(5));
        
        
	}

}
