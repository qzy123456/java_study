package part09�쳣ʾ������;

public class App9_8 {

	public static void main(String[] args) {
		int n=0,m=0,t=555;
		try {
			m=Integer.parseInt("8888");
			m=Integer.parseInt("abc789");
			t=9999;
		}
		catch(NumberFormatException e){
			System.out.println("�쳣��"+e);
			System.out.println("�쳣��"+e.getMessage());
			e.printStackTrace();
			n=123;
		}
		System.out.println("n="+n+",m="+m+",t="+t);

	}

}
