package Java09.part09异常示例程序;

public class App9_4 {
	public static double multi(int n){  //�ڷ��������׳��쳣
		  if (n<0)
			throw new IllegalArgumentException("�����׳��쳣");
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
        	System.out.println("������û�в���");
        }
		catch (NumberFormatException e){
        	System.out.println("Ӧ������һ������");        	
        }
		catch (IllegalArgumentException e){
        	System.out.println("���ֵ��쳣�ǣ�����������"+e.toString());        	
        }
		finally {System.out.println("�������н���");}
	}
}
