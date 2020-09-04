package 第04章循环程序案例;

public class Squre2 {	
	public static void main(String[] args) {		
		double num=10.0;
		int j,i=0;
		double g=0;
		for (j=1;j< num+1;j++){  ///求平方根的整数部分, j*j<num, (j+1)*(j+1)>num
			if (j*j<num && (j+1)*(j+1)>num){
				g=j;	
				break;
			}
		}
		System.out.println("计算结果的整数部分是="+g);
		
		while ( (num-g*g)>0.0001){ //求平方根小数部分
			g=g+0.0001;
			i=i+1;	
			System.out.println("第"+i+"步计算结果="+g+" 误差="+(num-g*g));
			
		}
		System.out.println("计算"+10+"的平方根结果是："+g);		
	}
}
