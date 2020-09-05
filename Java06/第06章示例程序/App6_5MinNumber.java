package Java06.第06章示例程序;

class LeastNumb  {  
	public void least(int[ ] array)  //����array����һά��������
     {
          int temp=array[0];
          for (int i=1;i<array.length;i++)
              if (temp>array[i])
                  temp=array[i];
              System.out.println("��С����Ϊ��" + temp);
     }
}

   public class App6_5MinNumber {
	  public static void main (String[] args) {
		   
        int[ ] a={8,3,7,88,9,23};   //����һά����a
        LeastNumb minNumber = new LeastNumb();
        minNumber.least(a);  //��һά����a����least()����
        
        //��������������������С
        (new LeastNumb()).least(a);
    }
	
}


