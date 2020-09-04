package 方法;

public class DemoFunction_CommonFactor {
	//计算公因数方法，无返回类型
	public static void findFactor(int num1, int num2) { 
	    for (int  i = 1; i <= num1 &&  i <= num2; i++) {
	           if (num1 % i == 0 && num2 % i == 0)
	                System.out.println(i + "\t");
	          }
	  System.out.println("计算完毕");
	 }
	
	public static void main(String[] args) {
	    int a=88, b=220;
	    findFactor(a,b); //调用计算公因素方法   
	    findFactor(24, 270); //调用计算公因素方法   


	}

}
