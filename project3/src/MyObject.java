public class MyObject {
    static class StudentA {
        String  name;
        int age;
        float   chinese;
         float   math;
        float   english;
        void setStudent (String  name, int age, float chinese,float math,float english) {
            this.name = name;
            this.age = age;
            this.chinese = chinese;
            this.math = math;
            this.english = english;
        }

        float total(){
            return this.chinese + this.english + this.math;
        }

        float average(){
            return (this.chinese + this.english + this.math) / 3;
        }
    }
    public static void main(String [] args) {
        StudentA s1 = new StudentA();
        s1.setStudent("齐朝阳",26,80,85,90);
        System.out.println("s1总成绩为"+ s1.total());
        System.out.println("s1平均成绩为"+ s1.average());

        StudentA s2 = new StudentA();
        s2.setStudent("Jack",20,78,87,87);
        System.out.println("s2总成绩为"+ s2.total());
        System.out.println("s2平均成绩为"+ s2.average());

        StudentA s3 = new StudentA();
        s3.setStudent("Mike",25,80,89,98);
        System.out.println("s3总成绩为"+ s3.total());
        System.out.println("s3平均成绩为"+ s3.average());

        StudentA max = s1.total()>s2.total() ? s1 : s2;
                 max = max.total()>s3.total()?max:s3;
        System.out.println("总成绩最大的人的姓名为"+ max.name  + "及成绩为"+ max.total());
    }
}
