package part11多线程;
class ThreadSale2 implements Runnable {
	private int tickets=10;
	public void run(){
		while(true){
		if (tickets>0) 
			System.out.println(Thread.currentThread().getName()+" 售票机 第"+tickets--+"号");
		else
			System.exit(0);
	 }
	}//end while
} 
public class App11_5 {
	public static void main(String[] args) {
		ThreadSale2 t=new ThreadSale2();
		Thread t1=new Thread(t,"售票窗口1");
		Thread t2=new Thread(t,"售票窗口2");
		Thread t3=new Thread(t,"售票窗口3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("主方法main运行结束！");

	}

}
