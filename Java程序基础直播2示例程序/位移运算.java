
public class 位移运算 {

	public static void main(String[] args) {
		
		long  a=-10;
		a=a<<1;
		System.out.println("a="+a);
		
		a=10;
		a=a>>1;
		System.out.println("a="+a);
		
		a=10;
		a=a>>2;
		System.out.println("a="+a);
		
		a=-4;
		a=a>>>1;
		System.out.println("a="+a);
		
		//如下代码不能对浮点数进行位移运算
//		double b=1.0d;
//		b=b<<2;   	
		
	}

}
