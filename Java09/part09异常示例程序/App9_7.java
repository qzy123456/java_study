package Java09.part09异常示例程序;

//App9_7.java
class CircleException extends Exception { //�Զ����쳣��
  double radius;
  CircleException(double r)  {
	  radius = r;
   }
   public String toString()  {
	   return "�뾶r="+radius+"����һ������";
  }
}

class Circle  {  //����Circle��
  private double radius;
  public void setRadius(double r) throws CircleException   //�ɷ����׳��쳣
  {
    if(r<0)
      throw new CircleException(r);   //�׳��쳣
    else
      radius=r;
  }
  public void show() {
    System.out.println("Բ���="+3.14*radius*radius);
  }
}

public class App9_7{
  public static void main(String[] args)  {
    Circle cir=new Circle();
    try{
      cir.setRadius(-2.0);  //������setRadius()�����׳����쳣
    }
    catch(CircleException e) {
      System.out.println("�Զ����쳣:"+e.toString()+"");
    }
    cir.show();
  }
}