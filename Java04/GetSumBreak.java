
public class GetSumBreak {
    public static void main(String[] args) {
        int sum = 0; // �����ܺͱ���
        int control = 1; // �������Ʊ���
        
        while (true) { // ���޵�whileѭ��
            sum += control++; // �ۼ��ܺͲ��������Ʊ���
            if (control > 100) { // ������Ʊ�������100
                // ����ܺ�
                System.out.println("1��100���������ĺ��ǣ�" + sum);
                break; // ��ֹѭ��
            }//end if
        }
    }
}
