abstract class Shape{
    public abstract double Area();
    public abstract void printArea();
}
class Rectangle extends Shape{
    public double weight;
    public double heiht;
    public double area;
    public Rectangle(double weight,double heiht){
        this.weight = weight;
        this.heiht = heiht;
        this.Area(weight,heiht);
    }
    @java.lang.Override
    public double Area(double weight,double heiht) {
      this.area = this.weight * this.heiht;
    }

    @java.lang.Override
    public void printArea() {
        System.out.println("Rectangle的面积为 "+this.area);
    }
}
class Circle extends  Shape{
    static final double pi=3.14;
    public double area;
    public double radius;

    public Shape(double radius){
        this.radius = radius;
        this.Area(radius);
    }
    @java.lang.Override
    public double Area(double radius) {
        this.area = this.radius * this.radius * pi;
    }

    @java.lang.Override
    public void printArea() {
        System.out.println("Circle的面积为 "+this.area);
    }
}

public class Chouxiang{
    public static void main(String[] args) {
       Rectangle s1 = new Rectangle(3,4);
                s1.printArea();
       Circle    s2 = new Circle(2);
            s2.printArea();
    }
}