package pers.huangyuhui.adapter_pattern.adapter2;

/**
 * @project: design-patterns
 * @description: 充当Adapter角色
 * @author: 黄宇辉
 * @date: 9/3/2019-4:22 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void pintStrong() {
        banner.showWithAster();
    }
}
