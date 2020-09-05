package Java06.fangfa;
public class GetMaxInArray {
	public static double getMax(double[] a){
		double max=a[0];
		for (int i=1;i<a.length;i++){
			if (a[i]>max)
				max=a[i];
		}
		return max;
	}	
	

	public static void main(String[] args) {
		double[] arr={1.1, 1.2, 1.3, 1.4};	
		double mymax=getMax(arr);		
		System.out.println("��������Ԫ����:"+mymax);
	}	
}
