package pers.huangyuhui.command_pattern.command_pattern_2;

import java.awt.*;

/**
 * @project: design-patterns
 * @description: 表示"绘制一个点的命令"的类,充当具体的命令
 * @author: 黄宇辉
 * @date: 9/20/2019-9:33 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DrawCommand implements Command {

    //绘制对象
    protected Drawable drawable;

    //绘制位置
    private Point position;

    //构造函数
    public DrawCommand(Drawable drawable, Point position) {
        this.drawable = drawable;
        this.position = position;
    }

    //执行命令
    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }

}
