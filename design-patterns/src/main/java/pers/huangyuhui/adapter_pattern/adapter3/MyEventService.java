package pers.huangyuhui.adapter_pattern.adapter3;

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

/**
 * @project: design-patterns
 * @description: 充当具体业务类
 * @author: 黄宇辉
 * @date: 9/3/2019-4:40 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class MyEventService extends MyWindowAdapter {

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened : Hello");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing : Bye");
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked : Clicked");
    }

}
