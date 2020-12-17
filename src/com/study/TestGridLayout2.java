package src.com.study;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGridLayout2 {
    public static JFrame main = new JFrame("テスト画面");
    //
    public static JTextArea Result = new JTextArea("", 4, 40);
    //
    public static JButton Submit = new JButton("開始");
    /**
     * メイン関数
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("開始！");
        main.setSize(500, 400);
        main.setLocation(300, 300);
        main.setResizable(false);
        main.setLayout(new GridBagLayout());
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //
        Container mPanel = main.getContentPane();
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(10, 0, 0, 10);
        //定义按钮位置
        c.gridx = 0;
        c.gridy = 5;
        c.gridheight = 3;
        c.fill = GridBagConstraints.VERTICAL;
        c.anchor = GridBagConstraints.CENTER;
        mPanel.add(Submit, c);
        //绑定事件
        Submit.addActionListener(new SubmitAction());
        main.setVisible(true);
        System.out.println("完了！");
    }
}
class SubmitAction extends JFrame implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        // TODO 自動生成されたメソッド・スタブ
        System.out.println("完了！");
        System.exit(0);
    }
}
