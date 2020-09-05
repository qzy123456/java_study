package Java04;

public class CommonDivisor {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 98;
        for (int x = 1; x <= num1 && x <= num2; x++) {        	
            if (num1 % x == 0 && num2 % x == 0)
                System.out.println(x + "\t��"+num1+"��"+num2+"�Ĺ�Լ��");
        }
    }
}
