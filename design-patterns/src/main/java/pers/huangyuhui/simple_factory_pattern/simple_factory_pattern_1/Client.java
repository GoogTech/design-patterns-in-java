package pers.huangyuhui.simple_factory_pattern.simple_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/6/2019-9:47 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {
    public static void main(String[] args) {
        Chart histogram = ChartFactory.getChar("histogram");
        histogram.display();
    }
}
