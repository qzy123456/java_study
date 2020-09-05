package 第04章循环程序案例;
public class InterestByFor {	
	public static void main(String[] args) {
		double total=0;
		int month;
		 for(month=1;month<=3;month++){
			total=(100+total)*(1+0.05/12);			
		}
		System.out.println("3个月后的本息总和为:"+total);	
	}
}
