package Java01;

public class ComputeArea {
 public static void main(String[] args) {
    double radius;
    double area;
    final double PI = 3.14159 ;  //����PI����  
    radius = 10.0;               // ���뾶��ֵ    
     area = radius * radius * PI; // ����Բ���
    // ��ʾ���
    System.out.println("The area for the circle of radius " +
      radius + " is " + area);
  }
}
