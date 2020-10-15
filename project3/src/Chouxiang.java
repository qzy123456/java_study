abstract class Shapes {
    public abstract double Area();

    public abstract void printArea();
}

 class Rectangle extends Shapes {
    public double weight;
    public double heiht;
    public double area;

    public Rectangle(double weight, double heiht) {
        this.weight = weight;
        this.heiht = heiht;
        this.Area();
    }

     @java.lang.Override
    public double Area() {
        this.area = this.weight * this.heiht;
        return  this.area;
    }

     @java.lang.Override
    public void printArea() {
        System.out.println("Rectangle的面积为 " + this.area);
    }
}

 class Circle extends Shapes {
    static final double pi = 3.14;
    public double area;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.Area();
    }

     @java.lang.Override
    public double Area() {
        this.area = this.radius * this.radius * pi;
        return  this.area;
    }

     @java.lang.Override
    public void printArea() {
        System.out.println("Circle的面积为 " + this.area);
    }
}

public class Chouxiang {
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle(3, 4);
        s1.printArea();
        Circle s2 = new Circle(2);
        s2.printArea();
    }
}