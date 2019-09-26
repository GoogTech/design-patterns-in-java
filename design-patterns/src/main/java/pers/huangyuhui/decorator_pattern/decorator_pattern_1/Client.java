package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/9/2019-3:03 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        Component component = new Window();
        component.display();

        System.out.println("------------------");

        Component component2 = new ScrollBarDecorator(component);
        component2.display();
    }
}
