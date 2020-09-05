package part09异常示例程序;
//App9_7.java
class CircleException extends Exception { //自定义异常类
  double radius;
  CircleException(double r)  {
	  radius = r;
   }
   public String toString()  {
	   return "半径r="+radius+"不是一个正数";
  }
}

class Circle  {  //定义Circle类
  private double radius;
  public void setRadius(double r) throws CircleException   //由方法抛出异常
  {
    if(r<0)
      throw new CircleException(r);   //抛出异常
    else
      radius=r;
  }
  public void show() {
    System.out.println("圆面积="+3.14*radius*radius);
  }
}

public class App9_7{
  public static void main(String[] args)  {
    Circle cir=new Circle();
    try{
      cir.setRadius(-2.0);  //捕获由setRadius()方法抛出的异常
    }
    catch(CircleException e) {
      System.out.println("自定义异常:"+e.toString()+"");
    }
    cir.show();
  }
}