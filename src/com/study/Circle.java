package src.com.study;
class Circle {
    static final double pi = 3.14;
    public double area;    //面积
    public double r;  //半径

    public Circle() {
        this.r = 0;
    }
    public Circle(double r) {
        this.r = r;
    }
    //半径
    public double getRadius(){
        return this.r;
    }
    //周长
    public double getLength(){
        return 2 * this.r * pi;
    }
    //面积
    public double getArea(){
        return this.r * this.r * pi;
    }
    //打印
    public void disp(){
        System.out.println("圆的半径 "+this.r+",圆的周长 "+this.getLength()+",圆的面积 "+this.getArea());
    }
    public static void main(String[] args) {
        Circle circle = new Circle(6);
        circle.disp();
    }
}
class Cylinder extends Circle{
    public double h;  //高
   public Cylinder(double r,double h){
        this.r = r;
        this.h = h;
    }
    //获得圆柱体的高
    public double getHeight(){
       return this.h;
    }
    //获得圆柱体的体积
    public double getVol(){
       return this.r * this.r * pi * this.h;
    }
    //打印体积
    public void dispVol(){
        System.out.println("圆柱的体积 "+this.getVol());
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(6,8);
        cylinder.dispVol();
    }
}
