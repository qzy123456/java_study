package ·½·¨;
public class TestVoidMethod {	
	public static void printGrand(double score) {
		if (score>=90.0)
			System.out.println('A');
		else if (score>=80.0)
			System.out.println('B');
		else if (score>=70.0)
			System.out.println('C');
		else if (score>=60.0)
			System.out.println('D');
		else 
			System.out.println('E');
	}
	
	public static void main(String[] args) {
		System.out.print(" The grad is:");
		printGrand(86.5);
		System.out.print(" The grad is:");
		printGrand(59.5);
	}
}
