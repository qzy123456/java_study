package Java09.part09异常示例程序;

public class App9_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int i;
         int[] a={1,2,3,4};
         for (i=0;i<5;i++){
        	 try 
        	 {  System.out.print("a["+i+"]/"+i+"="+(a[i]/i)); }
        	
        	 catch (NegativeArraySizeException e){
        		 System.out.print("����Ԫ�ظ���Ϊ���쳣");
        	 }
        	 catch (ArrayIndexOutOfBoundsException e){
        		 System.out.print("�����������±�Խ���쳣");
        	 }
        	 catch (ArithmeticException e){
        		 System.out.println("�쳣��������:"+e);
        	 }
        	 catch (Exception e){
        		 System.out.println("����:"+e.getMessage()+"�쳣!");
        	 }
        	 finally {
        		 System.out.println(" finally i="+i);
        	 }
        	 System.out.print("����");
         }
	}
}
