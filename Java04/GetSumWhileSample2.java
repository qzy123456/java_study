package Java04;
/**
  * С�����
 *1+0.9+0.8+����+0.1�Ĵ���
 */
public class GetSumWhileSample2 {
	public static void main(String[] args) {
		double item=1; 
		double sum=0;
		while ( item!=0) { //�޷�ȷ��0�Ƿ����0		   
		   sum+=item;		  
		   System.out.printf("��ǰitem %1.20f\n",item);
		   item=item-0.1;
		}
		System.out.println("sum="+sum);
	}
}
