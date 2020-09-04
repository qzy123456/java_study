package part11多线程;

class Tickets{
	int size;
	int number=0;
	boolean available=false;
	public Tickets(int size){
		this.size=size;
	}
	public synchronized void put(){
		if (available)
			try {wait();
			}
		catch (Exception e){
			System.out.print("发现异常");
		}
		System.out.println("存入"+ (++number)+"号票");
		available=true;
		notify();
	}
	public synchronized void sell(){
		if (!available)
			try {wait();}
		catch (Exception e){
			System.out.print("发现异常");
			}
		System.out.println("售出"+ (number)+"号票");
		available=false;
		notify();
		if (number==size)
			number=size+1;
	}
}

class Producer extends Thread{
	Tickets t=null;
	public Producer(Tickets t){
		this.t=t;
	}
	public void run(){
		while (t.number<t.size)
			t.put();
	}
}

class Consumer extends Thread{
	Tickets t=null;
	public Consumer(Tickets t){
		this.t=t;
	}
	public void run(){
		while (t.number<t.size)
			t.sell();
	}
}

public class App11_8 {
	public static void main(String[] args) {
		Tickets t=new Tickets(10);
		new Producer(t).start();
		new Consumer(t).start();

	}

}
