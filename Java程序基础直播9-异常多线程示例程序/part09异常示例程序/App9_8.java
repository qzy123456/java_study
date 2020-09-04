package part09异常示例程序;

public class App9_8 {

	public static void main(String[] args) {
		int n=0,m=0,t=555;
		try {
			m=Integer.parseInt("8888");
			m=Integer.parseInt("abc789");
			t=9999;
		}
		catch(NumberFormatException e){
			System.out.println("异常："+e);
			System.out.println("异常："+e.getMessage());
			e.printStackTrace();
			n=123;
		}
		System.out.println("n="+n+",m="+m+",t="+t);

	}

}
