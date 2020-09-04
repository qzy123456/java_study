package 第04章循环程序案例;
public class Pyramid {
    public static void main(String[] args) {
        int row = 13; // 声明行数
        for (int j = 1; j <= 13; j++) { // 第一层循环，控制每一行
            for (int i = row; i >= j; i--) { // 嵌套的第一个循环，控制每行左侧空格数量
                System.out.print("   "); // 输出3个空格
            }
            
            for (int i = j; i >= 1; i--) { // 嵌套的第二个循环，控制每行左半部输出
                System.out.print(i < 10 ? "  " + i : " " + i);
            }
            
            for (int i = 2; i <= j; i++) { // 嵌套的第三个循环，控制每行右半部输出
                System.out.print(i < 10 ? "  " + i : " " + i);
            }
            System.out.println(); // 控制第一层循环的换行
        }
    }
}
