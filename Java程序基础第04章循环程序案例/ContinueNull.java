package 第04章循环程序案例;
public class ContinueNull {
    public static void main(String[] args) {
        System.out.println("100以内能被7整除的数有：");
        for (int i = 1; i < 100; i++) {
            if (i % 7 != 0) { // 当i的值不能被7整除时
             continue; // 结束本次循环，放弃不能被7整除的数,不执行之后的打印语句
            }
            System.out.print(i + ","); // 输出i的值

        }
    }
}
