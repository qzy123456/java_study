package Java04;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // ��һ��ѭ��
            for (int j = 1; j <= 9; j++) { // �ڶ���ѭ��
                String str = j + "*" + i + "=" + j * i;
                System.out.print(str + "\t"); // ʹ���Ʊ����ʽ�����
            }
            System.out.println();
        }
    }
}

