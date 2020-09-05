package Java04;

import java.util.Scanner;
public class DoWhileSample1 {
public static void main(String[] args) {
	int data;
	Scanner input=new Scanner(System.in);
	do {
		  System.out.println("����һ������,ϵͳ���ӡ����(����0�����ִֹͣ��)��");
		  data=input.nextInt();
		  System.out.println("�û������������:"+data);
		}while(data!=0); 
	
	System.out.println("�û�������ϡ�");
	}
}
