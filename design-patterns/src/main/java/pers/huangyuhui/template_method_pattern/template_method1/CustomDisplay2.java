package pers.huangyuhui.template_method_pattern.template_method1;

/**
 * @project: design-patterns
 * @description: 充当具体类角色
 * @author: 黄宇辉
 * @date: 9/4/2019-11:03 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class CustomDisplay2 extends AbstractDisplay {

    private String string;
    private int width;

    public CustomDisplay2(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
