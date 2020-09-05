package Java09.part09异常示例程序;

//App9_5.java          ʹ��throws����ڷ���֮���׳��쳣
public class App9_5
{
  static void check(String str1) throws NullPointerException  //����ͷ�׳���ָ���쳣
  {
    if(str1.length()>2)     //����ַ�������str���ַ����ȴ���2
    {
      str1=null;            //���ַ���������ֵΪ��
      System.out.println(str1.length());     //��ͼ����մ��ĳ��Ȼ��׳���ָ���쳣
    }
    char ch;
    for (int i=0;i<str1.length();i++)
    {
      ch=str1.charAt(i);
      if(!Character.isDigit(ch))                 //�жϲ������ַ��Ƿ�Ϊ����
        throw new NumberFormatException();       //�������׳���ֵ��ʽ�쳣
    }
  }
  public static void main(String[] args) throws Exception  //�׳��쳣��ϵͳ����
  {
    int num;
    try
    {
      check(args[0]);
      num=Integer.parseInt(args[0]);
      if (num>60)
        System.out.println("�ɼ�Ϊ��"+num+"  ����");
      else 
        System.out.println("�ɼ�Ϊ��"+num+"  ������");
    }
    catch(NullPointerException e)
    {
      System.out.println("��ָ���쳣��"+e.toString());
    }    	
    catch (NumberFormatException ex)
    {
      System.out.println("����Ĳ���������ֵ����");
    }
    catch (Exception e)
    {
      System.out.println("��������û���ṩ����");
    }
  }
}
