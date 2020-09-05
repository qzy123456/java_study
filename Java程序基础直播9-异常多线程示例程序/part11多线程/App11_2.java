package part11多线程;
class MyRunnable implements Runnable{
	private String who;
	public MyRunnable(String str){
		who=str;
	}
	public void run(){
		for (int i=0;i<15;i++){
			try {
				Thread.sleep((int)(1000*Math.random()));
			}
			catch (InterruptedException e){}
			System.out.println(who + "正在运行");
		}
	}
}
public class App11_2 {
	public static void main(String[] args) {
		MyRunnable you=new MyRunnable("you");
		MyRunnable she=new MyRunnable("she");
		Thread t1=new Thread(you);
		Thread t2=new Thread(she);
        t1.start();
        t2.start();
        System.out.println("主方法main运行结束！");
	}

}
