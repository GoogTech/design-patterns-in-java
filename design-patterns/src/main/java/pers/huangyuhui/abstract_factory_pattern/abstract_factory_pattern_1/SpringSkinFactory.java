package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: Spring皮肤风格的工厂类, 充当具体工厂
 * @author: 黄宇辉
 * @date: 9/7/2019-5:29 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class SpringSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
