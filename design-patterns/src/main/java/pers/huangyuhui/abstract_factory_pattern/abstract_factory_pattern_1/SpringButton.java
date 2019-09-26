package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: Spring风格皮肤的按钮类, 充当具体产品
 * @author: 黄宇辉
 * @date: 9/7/2019-5:19 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("spring theme———>this is button");
    }
}
