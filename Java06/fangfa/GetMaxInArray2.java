package Java06.fangfa;

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
		
		System.out.println("��������Ԫ����:"+mymax);		
		System.out.println("��ӡs:"+s);
		System.out.println("��ӡnum:"+num);
		System.out.println("��ӡ�����һ��Ԫ��:"+arr[0]);
	}	
}
