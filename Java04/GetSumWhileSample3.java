package Java04;
/**
 * 
 * С�����
 *1+0.9+0.8+����+0.1�Ĵ���ß
 */
public class GetSumWhileSample3 {
	public static void main(String[] args) {
		double item=0.0; 
		double sum=0;
		while ( item<=1.0) {		   
		   sum+=item;		   
		   System.out.printf("��ǰitem %1.20f\n",item);
		   item=item+0.1;
		}
		System.out.printf("sum=%2.10f, item=%2.10f",sum,item);
	}
}
