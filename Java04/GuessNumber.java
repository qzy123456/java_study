import java.util.*;
/**
  * ��������һ�����ֲ²���Ϸʹ��whileѭ��ʵ�֣�����random()������������� 
 */
public class GuessNumber {

	public static void main(String[] args) {
		int number=(int)(Math.random()*101);
		Scanner sc=new Scanner(System.in);
		System.out.println("��д�²�һ��0~100֮�ڵ�����");
	    
		int guess=-1;
		while(guess!=number){
			System.out.println("��������Ĳ²�:");
			guess=sc.nextInt();
			if (guess==number){
				System.out.println("�²��ֵ����ȷ��");
			}
			else if (guess>number)
				System.out.println("�²��ֵ����");
			   else
			    System.out.println("�²��ֵС��");
		}
		 
	}
}
