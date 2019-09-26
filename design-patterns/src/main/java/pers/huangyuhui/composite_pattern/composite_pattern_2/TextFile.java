package pers.huangyuhui.composite_pattern.composite_pattern_2;

/**
 * @project: design-patterns
 * @description: 文本文件类, 充当叶子构件类
 * @author: 黄宇辉
 * @date: 9/11/2019-1:31 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class TextFile extends AbstractFile {

    private String name;

    public TextFile(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void killVirus() {
        System.out.println("——————> 对文本文件[ " + name + " ]进行杀毒");
    }
}
