//Unicode编码
public class PrintChar {
	public static void main(String[] args) {
		System.out.println("\102");	            // 八进制编码的字符
		System.out.println("\u0042");	        // 十六进制编码的字符
		System.out.println("苹果\t橘子\t香蕉");  // 使用制表符分割
		System.out.println("\\字符是反斜杠");    // 输出反斜杠
		System.out.println("\n换行字符");	    // 输出回车
		
		System.out.println("\u6b22\u8FCE"); //欢迎两个字的unicode编码
		System.out.println("\u0061");     //a的unicode编码
	}
}

