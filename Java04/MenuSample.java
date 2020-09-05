package Java04;

import java.util.Scanner;
public class MenuSample {
	public static void main(String[] args) {
		int choice;
		Scanner input=new Scanner(System.in);
		do {
			  System.out.println("��ѡ����Ʒ 1:����,2:��֭,3:�̲�,0:�˳�");
			  choice=input.nextInt();
			  switch (choice){ //ʹ��switch�ṹ��ӡ�û���ѡ����
				  case 1:
					  System.out.println("�û�ѡ����һƿ����");
					  break;
				  case 2:
					  System.out.println("�û�ѡ����һƿ��֭");
					  break;
				  case 3:
					  System.out.println("�û�ѡ����һƿ�̲�");
					  break;
			  }	//end switch  
			  
			}while(choice!=0); 
		
		System.out.println("�û�������ϡ�");
		}
}

