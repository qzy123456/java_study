package 方法;

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
		 sum2=getSum(1,100);  //调用计算累加和方法，直接给定参数
		 System.out.println("累加和的结果是："+sum2);
		
		int  a=10, b=20;
		long sum;
		sum=getSum(a,b); //调用计算累加和方法，使用变量赋值参数  
	    System.out.println("累加和的结果是："+sum); 
	    
	   

	}

}
