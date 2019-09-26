package pers.huangyuhui.abstract_factory_pattern.abstract_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: 界面皮肤工厂接口, 充当抽象工厂
 * @author: 黄宇辉
 * @date: 9/7/2019-5:26 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public interface SkinFactory {

    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
