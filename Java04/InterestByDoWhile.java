
public class InterestByDoWhile {	
	public static void main(String[] args) {
		double total=0;
		int month=1;
		 do{
			total=(100+total)*(1+0.05/12);
			month++;
		}while(month<=3);
		System.out.println("3���º�ı�Ϣ�ܺ�Ϊ:"+total);			
	}
}
