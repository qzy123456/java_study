package 第04章循环程序案例;
/**
 * 
 * 小数相加
 *1+0.9+0.8+……0.2+0.1的代码
 */
public class GetSumWhileSample4 {
	public static void main(String[] args) {
		int item=1; 
		double sum=0;
		while ( item<=10) {		   
		   sum=sum+0.1*item;		  
		   System.out.printf("当前item %d\n",item);
		   item++;		   
		}
		System.out.println("sum="+sum);
	}
}
