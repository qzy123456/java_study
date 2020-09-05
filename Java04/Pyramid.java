package Java04;

public class Pyramid {
    public static void main(String[] args) {
        int row = 13; // ��������
        for (int j = 1; j <= 13; j++) { // ��һ��ѭ��������ÿһ��
            for (int i = row; i >= j; i--) { // Ƕ�׵ĵ�һ��ѭ��������ÿ�����ո�����
                System.out.print("   "); // ���3���ո�
            }
            
            for (int i = j; i >= 1; i--) { // Ƕ�׵ĵڶ���ѭ��������ÿ����벿���
                System.out.print(i < 10 ? "  " + i : " " + i);
            }
            
            for (int i = 2; i <= j; i++) { // Ƕ�׵ĵ�����ѭ��������ÿ���Ұ벿���
                System.out.print(i < 10 ? "  " + i : " " + i);
            }
            System.out.println(); // ���Ƶ�һ��ѭ���Ļ���
        }
    }
}
