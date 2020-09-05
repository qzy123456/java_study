package part11多线程;

public class App11_3 {
	
	public static void main(String[] args) {
		MyThread you=new MyThread("you");
		MyThread she=new MyThread("she");
        you.start();
       
        try {
        	you.join();
        }
        catch (InterruptedException e){}
       
        she.start();
        try {
        	she.join();
        }
        catch (InterruptedException e){}
        System.out.println("主方法main运行结束！");
	}

}
