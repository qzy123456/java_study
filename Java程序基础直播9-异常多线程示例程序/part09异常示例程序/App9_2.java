package part09异常示例程序;
public class App9_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i;
         int[] a={1,2,3,4};
         for (i=0;i<5;i++){
        	 try 
        	 {  System.out.print("a["+i+"]/"+i+"="+(a[i]/i)); }
        	
        	 catch (NegativeArraySizeException e){
        		 System.out.print("数组元素个数为负异常");
        	 }
        	 catch (ArrayIndexOutOfBoundsException e){
        		 System.out.print("捕获到了数组下标越界异常");
        	 }
        	 catch (ArithmeticException e){
        		 System.out.println("异常类名称是:"+e);
        	 }
        	 catch (Exception e){
        		 System.out.println("捕获:"+e.getMessage()+"异常!");
        	 }
        	 finally {
        		 System.out.println(" finally i="+i);
        	 }
        	 System.out.print("继续");
         }
	}
}
