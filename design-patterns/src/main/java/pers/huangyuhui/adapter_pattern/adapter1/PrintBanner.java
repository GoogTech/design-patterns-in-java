package pers.huangyuhui.adapter_pattern.adapter1;

/**
 * @project: design-patterns
 * @description: 充当Adapter角色
 * @author: 黄宇辉
 * @date: 9/3/2019-4:16 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        super.showWithParen();
    }

    @Override
    public void printStrong() {
        super.showWithAster();
    }
}
