import java.text.DecimalFormat;
interface Shape{
    float pi = 3.14f;
    abstract double area();
    abstract double volume();
}

class Cylinder implements Shape{
   private double redius;
   private int height;

   public Cylinder(double redius,int height){
       this.redius = redius;
       this.height = height;
   }
   public   double area() {
        return 2 * pi * redius * height + 2 * pi * redius * redius;
    }
    public double volume() {
        return  pi * redius * redius * height;
    }
}

public class MyInterface{
    public static void main(String[] args) {
       Shape a = new Cylinder(2.0,3);
        DecimalFormat myFormat = new DecimalFormat("0.00");
        System.out.println("圆柱的表面积"+myFormat.format(a.area()));
        System.out.println("圆柱的体积"+myFormat.format(a.volume()));
    }
}