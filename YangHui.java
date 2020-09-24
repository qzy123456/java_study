public class YangHui {
    public static void main(String[] args) {
        //1.二维数组的动态初始化

        int[][] yangHui = new int[10][];
        //2.二维数组的外层元素的动态初始化

        for (int i = 0; i < yangHui.length; i++) {

            yangHui[i] = new int[i + 1];

        }
        //3. 给二维数组的内层元素赋值

        for (int i = 0; i < yangHui.length; i++) {

            //3.1 每一行的首末元素赋值为1

            yangHui[i][0] = yangHui[i][i] = 1;

            //3.2 每一行的非首末元素赋值。规律为：yanghui[i][j] = yanghui[i-1][j-1] + yanghui[i-1][j];

            //if(i >= 2){

            for (int j = 1; j < yangHui[i].length - 1; j++) {

                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];

            }

            //}

        }


        //4. 遍历二维数组

        for (int i = 0; i < yangHui.length; i++) {

            for (int j = 0; j < yangHui[i].length; j++) {

                System.out.print(yangHui[i][j] + "  ");

            }

            System.out.println();

        }

    }

}
