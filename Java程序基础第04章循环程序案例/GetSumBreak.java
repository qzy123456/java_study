package 第04章循环程序案例;
public class GetSumBreak {
    public static void main(String[] args) {
        int sum = 0; // 声明总和变量
        int control = 1; // 声明控制变量
        
        while (true) { // 无限的while循环
            sum += control++; // 累加总和并步进控制变量
            if (control > 100) { // 如果控制变量大于100
                // 输出总和
                System.out.println("1至100所有整数的和是：" + sum);
                break; // 终止循环
            }//end if
        }
    }
}
