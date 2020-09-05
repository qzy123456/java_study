package Java04;

public class InterestByFor {
	public static void main(String[] args) {
		double total=0;
		int month;
		 for(month=1;month<=3;month++){
			total=(100+total)*(1+0.05/12);			
		}
		System.out.println("3���º�ı�Ϣ�ܺ�Ϊ:"+total);	
	}
}
