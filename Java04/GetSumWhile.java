package Java04;
//����1��100�ĺ�
public class GetSumWhile {
    public static void main(String args[]) {
        int x = 1; // ����int�ͱ���x����������ֵ
        int sum = 0; // ����������ڱ�����Ӻ�Ľ��
        while (x <= 100) {// ���������������������ʽ����ִ��ѭ�������
            sum=sum + x;
            x= x+1; }
        System.out.println("sum = " + sum); 
    }
}
