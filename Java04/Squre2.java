package Java04;

public class Squre2 {	
	public static void main(String[] args) {		
		double num=10.0;
		int j,i=0;
		double g=0;
		for (j=1;j< num+1;j++){  ///��ƽ��������������, j*j<num, (j+1)*(j+1)>num
			if (j*j<num && (j+1)*(j+1)>num){
				g=j;	
				break;
			}
		}
		System.out.println("������������������="+g);
		
		while ( (num-g*g)>0.0001){ //��ƽ����С������
			g=g+0.0001;
			i=i+1;	
			System.out.println("��"+i+"��������="+g+" ���="+(num-g*g));
			
		}
		System.out.println("����"+10+"��ƽ��������ǣ�"+g);		
	}
}
