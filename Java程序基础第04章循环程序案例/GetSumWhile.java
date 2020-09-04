package 第04章循环程序案例;

//计算1到100的和
public class GetSumWhile {
    public static void main(String args[]) {
        int x = 1; // 定义int型变量x，并赋给初值
        int sum = 0; // 定义变量用于保存相加后的结果
        while (x <= 100) {// 当变量满足满足条件表达式，则执行循环体语句
            sum=sum + x;
            x= x+1; }
        System.out.println("sum = " + sum); 
    }
}
