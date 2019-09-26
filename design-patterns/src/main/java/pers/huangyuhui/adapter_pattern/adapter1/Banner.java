package pers.huangyuhui.adapter_pattern.adapter1;

/**
 * @project: design-patterns
 * @description: 充当Adaptee角色
 * @author: 黄宇辉
 * @date: 9/3/2019-4:12 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
