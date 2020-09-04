package 第06章示例程序;
//本类会使用Cylinder类
public class App6_2 {
	
	public static void main(String[] args) {
		Cylinder volu1;
		volu1=new Cylinder();
		volu1.radius=2.8;
		volu1.height=5;
		volu1.pi=3;
		volu1.area();
        System.out.println("volu1体积是："+volu1.volume(5));
	
	
		Cylinder volu2;
		volu2=new Cylinder();
		volu2.radius=2.0;
		volu2.height=4;
		volu2.area();
	    System.out.println("volu2体积是："+volu1.volume(2));
    
	}
}
	

