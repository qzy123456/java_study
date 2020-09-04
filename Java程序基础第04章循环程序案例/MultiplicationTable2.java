package 第04章循环程序案例;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 9; i++) { // 第一层循环
                     for (int j = 1; j <= 9; j++) { // 第二次循环
                        if (j > i) { // 如果j>i
                         System.out.println(); // 换行
                         continue outer; // 跳过循环放弃不需要的乘数
                }
                String str = j + "*" + i + "=" + j * i;
                System.out.print(str + "\t"); // 使用制表符格式化输出
            }
            System.out.println();
        }
    }
}

