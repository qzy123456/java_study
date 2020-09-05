
public class ComputeArea {
 public static void main(String[] args) {
    double radius;
    double area;
    final double PI = 3.14159 ;  //定义PI常量  
    radius = 10.0;               // 给半径赋值    
     area = radius * radius * PI; // 计算圆面积
    // 显示结果
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}
