import java.util.*;       //导入Java类包
public class InputSample2 {
	public static void main(String[] args) {
		int a;
		String b;
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入一个整数和一个字符串");
		a=reader.nextInt();
		b=reader.next();
//		b=reader.nextLine();
		
		System.out.println("a="+a);
		System.out.println("b="+b);


	}

}
