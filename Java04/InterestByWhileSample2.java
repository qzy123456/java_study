package Java04;

/*
 * *���ձ�Ϣ�ͽ�������
 */
public class InterestByWhileSample2 {	
	public static void main(String[] args) {
		double total=0;
		int month=1;
		while (total<=2050){
			total=(100+total)*(1+0.05/12);
			month++;
		}
		//month����ѭ�����Ʊ�������total<=2050ʱ����Ҳ������1
		System.out.printf("%d���º�ı�Ϣ�ܺ�Ϊ %5.2f",month -1,total);	
	}
}
