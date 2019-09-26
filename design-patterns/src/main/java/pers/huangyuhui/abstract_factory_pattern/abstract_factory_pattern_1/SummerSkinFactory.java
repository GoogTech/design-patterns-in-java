package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: Summer风格皮肤的工厂类, 充当具体工厂
 * @author: 黄宇辉
 * @date: 9/7/2019-5:33 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class SummerSkinFactory implements SkinFactory {

    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}

