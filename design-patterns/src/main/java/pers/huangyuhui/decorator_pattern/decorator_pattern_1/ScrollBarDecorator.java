package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 滚动条装饰类, 充当具体装饰类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:54 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("为构件添加滚动条 !");
    }
}
