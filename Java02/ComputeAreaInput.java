package Java02;
import java.util.Scanner;       //����Java���
public class ComputeAreaInput {    
	 	 
	 public static void main(String[] args) { 
		final double PI = 3.14159 ;	 
	    double radius;     //�������������뾶��Ϣ                    
	    double area;       //������������������Ϣ                     
	   
	    System.out.print("������Բ�İ뾶��");
	   	Scanner reader=new Scanner(System.in);
	    radius=reader.nextDouble();
	    
	    area = radius * radius * PI;  //����Բ�����            
	    System.out.println("�뾶:" + radius + " : " + area); //��ӡ���	       
	  }	 
}