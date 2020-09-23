import java.util.*;
public class TestArray {
    public static void main(String[] args) {
        int i,max,min;

        int[] a = new int[5];

        Scanner reader = new Scanner(System.in);
        //循环输入
        for(i=0;i<5;i++){
            int j=i+1;
            System.out.println("请输入第"+j+"个数字：");
            a[i] =  reader.nextInt();
            System.out.println("第"+j+"个数字为: "+a[i]);
        }
        max = a[0];
        min = a[0];
        for ( i = 1; i <= 5; i++) {
            if(a[i - 1]>max){
                max= a[i-1];
            }
            //循环找到最小值
            if(a[i -1]<min){
                min= a[i-1];
            }
        }
        //输出
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
    }
}