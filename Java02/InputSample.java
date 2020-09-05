import java.util.*;       //导入Java类包
public class InputSample {
    public static void main(String[] args) {
    	 //输入姓名信息
        String name;
        System.out.println("请输入姓名");
        Scanner reader2=new Scanner(System.in);
        name=reader2.next(); 
    	
    	//输入年龄信息
       	 int age;    
       	 double height;
         Scanner reader=new Scanner(System.in);
         System.out.println("请输入年龄");
         age=reader.nextInt();
         
         //输入身高信息
         System.out.println("请输入年龄");
         height=reader.nextDouble();
                  
         
         System.out.println("姓名："+name+"年龄："+age+"身高："+height);
         
    }
}
