public class Person {
    static class App {
        public String name;
        private int age;

        public App() {
            System.out.println("Person（）方法被调用");
        }

        public App(String name) {
            this.name = name;
        }

        public App(String name, int age) {
            this(name);
            this.age = age;
        }

        public boolean setAge(int age) {
            if (age < 5 || age > 20) {
                return false;
            }
            this.age = age;
            return true;
        }

        public int getAge() {
            return this.age;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        App s1 = new App();
        s1.setName("齐朝阳");
        s1.setAge(19);
        System.out.println("s1的姓名 " + s1.name + " s1的年龄 " + s1.getAge());

        App s2 = new App("齐朝阳");
        if (!s2.setAge(25)) {
            s2.setAge(18);
        }
        System.out.println("s2的姓名 " + s2.name + " s2的年龄 " + s2.getAge());

        App s3 = new App("齐朝阳", 16);
        System.out.println("s3的姓名 " + s3.name + " s3的年龄 " + s3.getAge());
    }
}