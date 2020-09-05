package Java09.part11多线程;

class ThreadSale2 implements Runnable {
	private int tickets=10;
	public void run(){
		while(true){
		if (tickets>0) 
			System.out.println(Thread.currentThread().getName()+" ��Ʊ�� ��"+tickets--+"��");
		else
			System.exit(0);
	 }
	}//end while
} 
public class App11_5 {
	public static void main(String[] args) {
		ThreadSale2 t=new ThreadSale2();
		Thread t1=new Thread(t,"��Ʊ����1");
		Thread t2=new Thread(t,"��Ʊ����2");
		Thread t3=new Thread(t,"��Ʊ����3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println("������main���н�����");

	}

}
