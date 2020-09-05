package part11多线程;
class Mbank{
	private static int sum=2000;
	public synchronized static void take(int k){
		int temp=sum;
		temp=temp-k;
		try{
			Thread.sleep((int)(1000*Math.random()));
		   }
		catch (InterruptedException e){}
		sum=temp;
		System.out.println("sum="+sum);
	}
 }

class Customer extends Thread {
		public void run(){
		for( int i=1;i<=4;i++)  //从模拟银行类中分四次取钱
			Mbank.take(100);
	   }
	}


public class App11_7 {
		public static void main(String[] args) {
			Customer c1=new Customer(); //创建c1用户，对同一个模拟银行账户分四次取钱
			Customer c2=new Customer();//创建c2用户，对同一个模拟银行账户分四次取钱
			c1.start();
			c2.start();
		}
	}
	
	
	

