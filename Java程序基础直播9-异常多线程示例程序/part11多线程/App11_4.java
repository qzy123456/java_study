package part11多线程;
class ThreadSale extends Thread {
	private int tickets=10;
	public void run(){
		while(true){
		if (tickets>0) 
			System.out.println(getName()+" 售票机 第"+tickets--+"号");
		else
			System.exit(0);
	 }
	}//end while
}

public class App11_4 {

	public static void main(String[] args) {
		ThreadSale t1=new ThreadSale();
		ThreadSale t2=new ThreadSale();
		ThreadSale t3=new ThreadSale();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("主方法main运行结束！");

	}

}
