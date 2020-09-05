package part09异常示例程序;

public class App9_4 {
	public static double multi(int n){  //在方法里面抛出异常
		  if (n<0)
			throw new IllegalArgumentException("求负数阶乘异常");
		  double s=1;
		  for (int i=1;i<=n;i++) s=s*i;
		  return s;
		
	}
	public static void main(String[] args) {
		try {
			//int m=Integer.parseInt(args[0]);
			//System.out.println(m+"!="+multi(-2));
			System.out.println("m!="+multi(-2));
		}
        catch (ArrayIndexOutOfBoundsException e){
        	System.out.println("命令行没有参数");
        }
		catch (NumberFormatException e){
        	System.out.println("应该输入一个整数");        	
        }
		catch (IllegalArgumentException e){
        	System.out.println("出现的异常是：－－－－－"+e.toString());        	
        }
		finally {System.out.println("程序运行结束");}
	}
}
