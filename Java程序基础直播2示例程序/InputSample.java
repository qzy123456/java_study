import java.util.*;       //����Java���
public class InputSample {
    public static void main(String[] args) {
    	 //����������Ϣ
        String name;
        System.out.println("����������");
        Scanner reader2=new Scanner(System.in);
        name=reader2.next(); 
    	
    	//����������Ϣ
       	 int age;    
       	 double height;
         Scanner reader=new Scanner(System.in);
         System.out.println("����������");
         age=reader.nextInt();
         
         //���������Ϣ
         System.out.println("����������");
         height=reader.nextDouble();
                  
         
         System.out.println("������"+name+"���䣺"+age+"��ߣ�"+height);
         
    }
}
