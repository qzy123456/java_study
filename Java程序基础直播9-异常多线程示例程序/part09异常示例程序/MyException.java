package part09异常示例程序;

class AaaException extends Exception{ } 

public class MyException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		int a[]={1,2,3,4};
		for (int i=0; i<5;i++) {
		try{ 
		   System.out.println( a[i]);
		}
		     catch( ArrayIndexOutOfBoundsException e )
		     {  System.out.print("发现异常");
		 } 
		}
       
		int b[]=null;
		b[0]=1;
		
		try{ 
			   System.out.println( b[0]);
			}
		catch( NullPointerException e )  {  
			System.out.print("发现异常");
		
			}
       */
		m();
		
		  int a=3,b=0;
		     try { 
		    	 if (b!=0)
		    	 System.out.print( "a/b="+a/b);
		    	 else
		    	  throw new AaaException();
		       
		     }
		     catch ( AaaException e ) { System.out.print("发现异常");}


	}
    static void m(  ) throws ArithmeticException
		 { 
		 	int a=3,b=0;
		    System.out.print( "a/b="+a/b);
		 }
}
