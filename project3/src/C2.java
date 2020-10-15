public class C2 {
    public static void main(String[] args) {
        StudentB s1 = new StudentB("齐朝阳",21,"理工学院");
                s1.introduce();
        StudentB s2 = new StudentB("齐朝阳",22,"软件工程");
                s2.introduce();
    }


}

abstract class PersonB {
    String name;
    int age;
    public PersonB(){
        System.out.println("无参数的构造方法被调用");
    }
    public PersonB(String name){
        this.name = name;
    }
    void introduce(){
        System.out.println("姓名："+this.name + " 年龄："+this.age);
    };
}

class StudentB extends PersonB {
    String department;
   public StudentB(String name,int age,String department){
     super(name);
     this.department = department;
     this.age = age;
   }

//    @java.lang.Override
//    void introduce() {
//        System.out.println("姓名："+this.name + "年龄："+this.age + "部门："+this.department);
//    }
}
