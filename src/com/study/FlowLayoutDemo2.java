package src.com.study;

import java.awt.*;
import javax.swing.*;

//边界布局管理器
public class FlowLayoutDemo2 extends JFrame{  //0.继承JFrame
    //1. 定义组件
    JButton jButton1, jButton2,jButton3,jButton4,jButton5;

    public FlowLayoutDemo2() {
        //2. 创建组件
        jButton1 = new JButton("A");
        jButton2 = new JButton("B");
        jButton3 = new JButton("C");
        jButton4 = new JButton("D");
        jButton5 = new JButton("E");

        //3. 添加各个组件
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        this.add(jButton4);
        this.add(jButton5);
        //设置流布局
        this.setLayout(new FlowLayout()); //默认布局方式为居中
        this.setLayout(new FlowLayout(FlowLayout.LEFT));


        //4. 设置窗体属性
        this.setTitle("演示流布局管理器"); //设置标题
        this.setSize(200, 200);       //设置
        this.setLocation(200, 200);   //设置窗体出现的位置
        this.setVisible(true);        //设置窗体可见
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗体关闭的同时关闭jvm
        this.setResizable(false);  //Resizable:可调整大小的，设置窗体大小不可变
    }
    public static void main(String[] args) {
        FlowLayoutDemo2 testBorderLayout = new FlowLayoutDemo2();
    }
}

