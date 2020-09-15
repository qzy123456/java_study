import java.util.*;
public class InputSample {
    public static void main(String[] args) {
        String name;   //名字
        int studentNumbe; //学号
        int age;          //年纪
        double height;    //身高
        String sex;     //性别
        Scanner reader =new Scanner(System.in);

        System.out.println("请输入名字");
        name=reader.next();

        System.out.println("请输入学号");
        studentNumbe=reader.nextInt();

         System.out.println("请输入年龄：");
         age=reader.nextInt();

        System.out.println("请输入身高：");
         height=reader.nextDouble();

        System.out.println("请输入性别：");
        sex=reader.next();
         
         System.out.println("名字："+name+"学号："+studentNumbe+"身高："+height + "性别："+sex + "年龄：" + age);
         
    }
}
