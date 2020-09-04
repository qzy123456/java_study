package 第04章循环程序案例;
/**
  * 小数相加
 *1+0.9+0.8+……+0.1的代码
 */
public class GetSumWhileSample2 {
	public static void main(String[] args) {
		double item=1; 
		double sum=0;
		while ( item!=0) { //无法确定0是否等于0		   
		   sum+=item;		  
		   System.out.printf("当前item %1.20f\n",item);
		   item=item-0.1;
		}
		System.out.println("sum="+sum);
	}
}
