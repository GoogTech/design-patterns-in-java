package pers.huangyuhui.template_method_pattern.template_method2;

/**
 * @project: design-patterns
 * @description: 测试类
 * @author: 黄宇辉
 * @date: 9/4/2019-1:10 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Main {
    public static void main(String[] args) {
        DataViewer dataViewer = new CustomDataViewer1();
        DataViewer dataViewer2 = new CustomDataViewer2();
        dataViewer.process();
        System.out.println("--------------------");
        dataViewer2.process();
    }
}
