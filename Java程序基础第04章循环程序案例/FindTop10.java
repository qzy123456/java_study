package 第04章循环程序案例;

public class FindTop10 {
    public static void main(String[] args) {
        int num = 1; // 定义查找开始变量
        int findcount = 0; // 定义满足条件的数量
        while (findcount< 10) {  
            if  (num%5==0){
               System.out.println("能被5整除的是:" + num);
               findcount++; }
           num++;
        }
      }
}
