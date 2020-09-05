package 第04章循环程序案例;
/*
 * *按照本息和结束条件
 */
public class InterestByWhileSample2 {	
	public static void main(String[] args) {
		double total=0;
		int month=1;
		while (total<=2050){
			total=(100+total)*(1+0.05/12);
			month++;
		}
		//month不是循环控制变量，在total<=2050时，它也自增了1
		System.out.printf("%d个月后的本息总和为 %5.2f",month -1,total);	
	}
}
