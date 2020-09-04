package 第06章示例程序;

class LeastNumb  {  
	public void least(int[ ] array)  //参数array接收一维整形数组
     {
          int temp=array[0];
          for (int i=1;i<array.length;i++)
              if (temp>array[i])
                  temp=array[i];
              System.out.println("最小的数为：" + temp);
     }
}

   public class App6_5MinNumber {
	  public static void main (String[] args) {
		   
        int[ ] a={8,3,7,88,9,23};   //定义一维数组a
        LeastNumb minNumber = new LeastNumb();
        minNumber.least(a);  //将一维数组a传入least()方法
        
        //创建匿名对象求数组最小
        (new LeastNumb()).least(a);
    }
	
}


