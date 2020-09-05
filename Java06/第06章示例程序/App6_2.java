package Java06.第06章示例程序;
//�����ʹ��Cylinder��
public class App6_2 {
	
	public static void main(String[] args) {
		Cylinder volu1;
		volu1=new Cylinder();
		volu1.radius=2.8;
		volu1.height=5;
		volu1.pi=3;
		volu1.area();
        System.out.println("volu1����ǣ�"+volu1.volume(5));
	
	
		Cylinder volu2;
		volu2=new Cylinder();
		volu2.radius=2.0;
		volu2.height=4;
		volu2.area();
	    System.out.println("volu2����ǣ�"+volu1.volume(2));
    
	}
}
	

