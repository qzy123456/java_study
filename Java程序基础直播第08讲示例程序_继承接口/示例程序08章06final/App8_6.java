package 示例程序08章06final;
class AAA{
	static final double pi=3.14;
	public final void show(){
		System.out.println("pi="+pi);
	}
}
class BBB extends AAA{
	private int num=100;
	public void show(){  //定义BBB类的show()方法，这里出现错误，
		                 //因为父类有了同名的方法并且是final类型，不允许覆盖
		System.out.println("num="+num);
	}
}
public class App8_6 {
	
	public static void main(String[] args) {
		BBB ex=new BBB();
		ex.show();
	}

}
