package Java04;

public class FindTop10 {
    public static void main(String[] args) {
        int num = 1; // ������ҿ�ʼ����
        int findcount = 0; // ������������������
        while (findcount< 10) {  
            if  (num%5==0){
               System.out.println("�ܱ�5��������:" + num);
               findcount++; }
           num++;
        }
      }
}
