package src.com.study;

import java.awt.*;
import javax.swing.*;

public class TestGridLayout extends JFrame{
    //定义组件
    int size = 9;
    //定义按钮数组
    JButton jButton[] = new JButton[size];

    //构造函数
    public TestGridLayout() {
        //创建组件
        for(int i = 0; i<size; i++){
            jButton[i] = new JButton(String.valueOf(i+1));
        }

        //添加组件
        for(int i = 0; i<size; i++){
            this.add(jButton[i]);
        }

        //设置网格布局
        this.setLayout(new GridLayout(3, 3, 10, 30));

        //设置窗格属性
        this.setTitle("演示网格布局管理器");
        this.setSize(400, 400);
        this.setLocation(200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);  //Resizable:可调整大小的

    }
    public static void main(String[] args) {
        TestGridLayout testGridLayout = new TestGridLayout();
    }
}
