package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: Summer风格皮肤的文本框类, 充当具体产品
 * @author: 黄宇辉
 * @date: 9/7/2019-5:23 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("Summer theme———>this is text field");
    }
}
