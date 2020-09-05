package Java04;

public class ContinueNull {
    public static void main(String[] args) {
        System.out.println("100�����ܱ�7���������У�");
        for (int i = 1; i < 100; i++) {
            if (i % 7 != 0) { // ��i��ֵ���ܱ�7����ʱ
             continue; // ��������ѭ�����������ܱ�7��������,��ִ��֮��Ĵ�ӡ���
            }
            System.out.print(i + ","); // ���i��ֵ

        }
    }
}
