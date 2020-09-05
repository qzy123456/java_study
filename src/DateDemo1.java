package src;

import java.text.*;
import java.util.Date;

class DateDemo1 {
   public static void main(String args[]) {
 
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
    System.out.println("当前时间为: " + ft.format(dNow)+"\n");
    //c的使用
    System.out.printf("C的使用全部日期和时间信息：%tc%n",dNow);
    //f的使用
    System.out.printf("f的使用年-月-日格式：%tF %tT%n",dNow,dNow);
    //d的使用
    System.out.printf("d的使用月/日/年格式：%tD%n",dNow);
    //r的使用
    System.out.printf("r的使用HH:MM:SS PM格式（12时制）：%tr%n",dNow);
    //t的使用
    System.out.printf("t的使用HH:MM:SS格式（24时制）：%tT%n",dNow);
    //R的使用
    System.out.printf("R的使用HH:MM格式（24时制）：%tR",dNow);
   }
}
