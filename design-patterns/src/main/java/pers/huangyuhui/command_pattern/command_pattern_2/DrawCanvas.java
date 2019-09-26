package pers.huangyuhui.command_pattern.command_pattern_2;

import java.awt.*;

/**
 * @project: design-patterns
 * @description: 实现"绘制对象"的类,充当接收者
 * @author: 黄宇辉
 * @date: 9/20/2019-9:39 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DrawCanvas extends Canvas implements Drawable {

    //颜色
    private Color color = Color.green;
    //要绘制的圆点半径
    private int redius = 5;
    //命令的历史记录
    private MacroCommand history;

    //构造函数
    public DrawCanvas(int width, int height, MacroCommand history) {
        this.setSize(width, height);
        this.setBackground(Color.white);
        this.history = history;
    }

    //重新全部绘制
    public void repaint(Graphics graphics) {
        history.execute();
    }

    //绘制
    @Override
    public void draw(int x, int y) {
        Graphics graphics = getGraphics();
        graphics.setColor(color);
        graphics.fillOval(x - redius, y - redius, redius * 2, redius * 2);
    }
}
