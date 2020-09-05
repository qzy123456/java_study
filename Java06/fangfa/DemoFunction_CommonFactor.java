package Java06.fangfa;

public class DemoFunction_CommonFactor {
	//���㹫�����������޷�������
	public static void findFactor(int num1, int num2) { 
	    for (int  i = 1; i <= num1 &&  i <= num2; i++) {
	           if (num1 % i == 0 && num2 % i == 0)
	                System.out.println(i + "\t");
	          }
	  System.out.println("�������");
	 }
	
	public static void main(String[] args) {
	    int a=88, b=220;
	    findFactor(a,b); //���ü��㹫���ط���   
	    findFactor(24, 270); //���ü��㹫���ط���   


	}

}
