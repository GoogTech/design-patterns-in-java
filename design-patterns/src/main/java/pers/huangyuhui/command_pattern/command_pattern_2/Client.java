package pers.huangyuhui.command_pattern.command_pattern_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/20/2019-9:48 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client extends JFrame {

    //绘制的历史记录
    private MacroCommand history = new MacroCommand();
    //绘制区域(设置画板大小)
    private DrawCanvas canvas = new DrawCanvas(600, 400, history);
    //删除按钮
    private JButton clearButton = new JButton("clear");

    public Client(String title) {
        super(title);

        /*
        鼠标拖动事件
         */
        canvas.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                Command command = new DrawCommand(canvas, e.getPoint());
                history.append(command);
                command.execute();
            }
        });

        /*
        动作监听事件
         */
        clearButton.addActionListener(e -> {
            if (e.getSource() == clearButton) {
                history.clear();
                canvas.repaint();
            }
        });

        /*
        JFrame面板配置
         */
        setLayout(new BorderLayout());
        add(clearButton, BorderLayout.NORTH);
        add(canvas, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Client("a simple drawing board");
    }

}
