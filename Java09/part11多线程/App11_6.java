package Java09.part11多线程;

class Mbank1{
	private static int sum=2000;
	public static void take(int k){
		int temp=sum;
		temp=temp - k;
		try{
			Thread.sleep((int )(1000*Math.random()));
		}
		catch (InterruptedException e){
			System.out.println("�����ն��쳣");
		}
		sum=temp;
		System.out.println("sum="+sum);
	}
}

class Customer1 extends Thread{
	public void run(){
		for (int i=1;i<=4;i++)
			Mbank1.take(100);
	}
}

public class App11_6 {
	public static void main(String[] args) {
		Customer1 c1=new Customer1();
		Customer1 c2=new Customer1();
		c1.start();
		c2.start();
	}
}
