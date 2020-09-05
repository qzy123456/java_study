public class InterestByWhile {
	
	public static void main(String[] args) {
		double total=0;
		int month=1;
		while (month<=3){
			total=(100+total)*(1+0.05/12);
			month++;
		}
		System.out.printf("3���º�ı�Ϣ�ܺ�Ϊ"+total);
	}
}
