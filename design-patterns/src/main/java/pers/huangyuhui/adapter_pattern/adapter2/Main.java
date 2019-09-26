package pers.huangyuhui.adapter_pattern.adapter2;

/**
 * @project: design-patterns
 * @description: 充当Client角色
 * @author: 黄宇辉
 * @date: 9/3/2019-4:26 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Adapter Pattern");
        print.printWeak();
        print.pintStrong();

    }
}
