package pers.huangyuhui.adapter_pattern.adapter1;

/**
 * @project: design-patterns
 * @description: 充当Client角色
 * @author: 黄宇辉
 * @date: 9/3/2019-4:17 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Main {
    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }
}
