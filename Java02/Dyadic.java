import java.util.*;
public class Dyadic {
    public static void main(String[] args) {
        int i,j;

        int[][] a = new int[2][3];

       for (i=0;i<2;i++){
           for (j=0;j<3;j++){
               a[i][j] = (int)(Math.random() * 100);
               System.out.print("a["+i+"]["+j+"] = "+a[i][j]+" ");
           }
           System.out.println();
       }
        System.out.println("---------------------------");

        for (i=0;i<2;i++){
            Arrays.sort(a[i]);
            for (j=0;j<3;j++){
                System.out.print("a["+i+"]["+j+"] = "+a[i][j]+" ");
            }
            System.out.println();
        }
    }
}