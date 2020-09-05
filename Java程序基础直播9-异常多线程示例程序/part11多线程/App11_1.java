package part11多线程;
class MyThread extends Thread{
	private String who;
	public MyThread(String str){
		who=str;
	}
	public void run(){
		for (int i=0;i<15;i++){
			try {
				sleep((int)(1000*Math.random()));
			}
			catch (InterruptedException e){}
			System.out.println(who + "正在运行");
		}
	}
}
public class App11_1 {

	public static void main(String[] args) {
		MyThread you=new MyThread("你");
		MyThread she=new MyThread("她");
        you.start();
        she.start();
        System.out.println("主方法main运行结束！");
	}

}
