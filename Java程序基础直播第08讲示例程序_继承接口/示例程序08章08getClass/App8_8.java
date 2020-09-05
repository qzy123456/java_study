package 示例程序08章08getClass;
class Person{
	 protected String name;
	 public Person(String xm){
		 name=xm;
	 }
	/*
	 public String toString(){
		 return this.name;
	 }
	 */
}
public class App8_8 {
	public static void main(String[] args) {
		Person per=new Person("张三");
		Class obj=per.getClass();
		System.out.println("对象per所属的类为："+obj);

	}
}
