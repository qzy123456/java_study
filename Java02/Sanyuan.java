package Java02;
public class Sanyuan {
	public static void main(String[] args) {
		int price=110, freight;
		boolean vipUser=false;
		freight=(price>=100 )||( vipUser==true )? 0:10;
		System.out.println("�˷��ǣ�"+freight);
	}
}
