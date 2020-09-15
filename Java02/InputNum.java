import java.util.*;
public class InputNum {
	public static void main(String[] args) {
		int a = 0;
		float b=0.0f;
		double c=0.0d;
		String s = "";
		Scanner reader=new Scanner(System.in);
		System.out.println("从键盘输入一个字符串");
		s=reader.nextLine();
		System.out.println("你输入的字符串为"+s);

		System.out.println("从键盘输入一个整数");
		a=reader.nextInt();
		System.out.println("你输入的整数为"+a);

		System.out.println("从键盘输入一个浮点数");
		b=reader.nextFloat();
		System.out.println("你输入的浮点数为"+b);

		System.out.println("从键盘输入一个双精度数");
		c=reader.nextDouble();
		System.out.println("你输入的双精度数为"+c);
	}

}
