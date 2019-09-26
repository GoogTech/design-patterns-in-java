package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 黑色边框装饰类, 充当具体装饰类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:59 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("为构件添加黑色边框 !");
    }
}
