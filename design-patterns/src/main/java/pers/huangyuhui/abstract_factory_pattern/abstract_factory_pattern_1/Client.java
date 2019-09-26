package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/7/2019-5:30 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {

        SkinFactory skinFactory = new SpringSkinFactory();
        skinFactory.createButton().display();
        skinFactory.createTextField().display();
        skinFactory.createComboBox().display();

        System.out.println("———————————————————");

        SkinFactory skinFactory2 = new SummerSkinFactory();
        skinFactory2.createButton().display();
        skinFactory2.createTextField().display();
        skinFactory2.createComboBox().display();

    }
}
