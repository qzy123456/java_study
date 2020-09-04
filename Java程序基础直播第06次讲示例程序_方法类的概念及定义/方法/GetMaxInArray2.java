package 方法;
public class GetMaxInArray2 {
	public static double getMax(double[] a){
		double max=a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>max)
				max=a[i];
		}
		return max;
	}	
	
	public static double getMax(double[] a, String inputs, int inputnum){
		double max=a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>max)
				max=a[i];
		}
		a[0]=9.9;		
		inputnum=2;
		System.out.println("inside1 s="+inputs);
		inputs="aaa";
		System.out.println("inside2 s="+inputs);
		return max;
	}

	public static void main(String[] args) {
		double[] arr={1.1, 1.2, 1.3, 1.4};		
		String s="abc";
		int num=1;		
		double mymax=getMax(arr,s,num);
		
		System.out.println("数组的最大元素是:"+mymax);		
		System.out.println("打印s:"+s);
		System.out.println("打印num:"+num);
		System.out.println("打印数组第一个元素:"+arr[0]);
	}	
}
