package pers.huangyuhui.template_method_pattern.template_method1;

/**
 * @project: design-patterns
 * @description: 测试类
 * @author: 黄宇辉
 * @date: 9/4/2019-10:54 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Main {

    public static void main(String[] args) {
        AbstractDisplay abstractDisplay = new CustomDisplay1("Template Method Pattern");
        AbstractDisplay abstractDisplay2 = new CustomDisplay2("Template Method Pattern");
        abstractDisplay.disply();
        abstractDisplay2.disply();
    }

}
