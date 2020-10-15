package Java08.示例程序08章11接口定义及使用;

interface Achievement{
    abstract float average();
}

class Personss{
    String name;
     int age;
     public Personss(String name,int age){
         this.name  = name;
         this.age = age;
     }
     public void introduce(){
         System.out.println("您好，我是 "+name+" ，今年 " + age + "岁");
     }
}
class Student extends Personss implements Achievement{
    int Chinese;
    int Math;
    int English;
    public Student(String name,int age){
        super(name, age);
    }
    public void setScore(int Chinese,int Math,int English){
        this.Chinese = Chinese;
        this.Math = Math;
        this.English = English;
    }

    @java.lang.Override
    public float average() {
        return (this.English + this.Math + this.Chinese)/3;
    }
}

public class JieKou{
    public static void main(String[] args) {
        Student s1 = new Student("张三",16);
        s1.introduce();
        s1.setScore(80,90,80);
        System.out.println("平均成绩为 "+s1.average());
    }
}