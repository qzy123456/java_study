public class Overrding{

    public static void main(String[] args) {
        Animal s1 = new Animal();
        s1.play();
        Bird s2 = new Bird();
        s2.play();
        Fish s3 = new Fish();
        s3.play();
        Animal a1=new Bird();
        Animal a2=new Fish();
        a1.play();
        a2.play();
    }
}
class Animal{
    void play(){
        System.out.println("我是 动物，我会 很多本领");
    }
}
class Fish extends Animal{
    @java.lang.Override
    void play() {
        System.out.println("我是鱼类，我会游泳");
    }
}
class Bird extends Animal{
    @java.lang.Override
    void play() {
        System.out.println("我是鸟类，我会飞翔");
    }
}