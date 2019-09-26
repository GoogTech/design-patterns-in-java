package pers.huangyuhui.adapter_pattern.adapter3;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @project: design-patterns
 * @description: 测试
 * @author: 黄宇辉
 * @date: 9/3/2019-4:47 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class MyController {
    public static void main(String[] args) {
        MyEventService myEventService = new MyEventService();
        JFrame j = new JFrame("title");
        j.setSize(500, 300);
        j.setVisible(true);
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //绑定事件
        j.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                myEventService.windowOpened(e);
            }

            @Override
            public void windowClosing(WindowEvent e) {
                myEventService.windowClosing(e);
            }
        });
        j.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                myEventService.mouseClicked(e);
            }
        });

    }
}
