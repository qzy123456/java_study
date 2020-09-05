package Java06.fangfa;

public class DemoFunction_Sum {

	public static long getSum(int begin, int end){
	    long sum=0;
	      for(int i=begin; i<=end; i++){
	          sum=i+sum;    
	       }
	        return sum;
	    } 

	public static void main(String[] args) {
		
		 long sum2;
		 sum2=getSum(1,100);  //���ü����ۼӺͷ�����ֱ�Ӹ�������
		 System.out.println("�ۼӺ͵Ľ���ǣ�"+sum2);
		
		int  a=10, b=20;
		long sum;
		sum=getSum(a,b); //���ü����ۼӺͷ�����ʹ�ñ�����ֵ����  
	    System.out.println("�ۼӺ͵Ľ���ǣ�"+sum); 
	    
	   

	}

}
