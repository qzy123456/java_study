package Java09.part11多线程;

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
		for( int i=1;i<=4;i++)  //��ģ���������з��Ĵ�ȡǮ
			Mbank.take(100);
	   }
	}


public class App11_7 {
		public static void main(String[] args) {
			Customer c1=new Customer(); //����c1�û�����ͬһ��ģ�������˻����Ĵ�ȡǮ
			Customer c2=new Customer();//����c2�û�����ͬһ��ģ�������˻����Ĵ�ȡǮ
			c1.start();
			c2.start();
		}
	}
	
	
	

