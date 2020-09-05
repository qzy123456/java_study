package 第04章循环程序案例;

public class InterestByDoWhile {	
	public static void main(String[] args) {
		double total=0;
		int month=1;
		 do{
			total=(100+total)*(1+0.05/12);
			month++;
		}while(month<=3);
		System.out.println("3个月后的本息总和为:"+total);			
	}
}
