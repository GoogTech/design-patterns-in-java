package pers.huangyuhui.composite_pattern.composite_pattern_2;

/**
 * @project: design-patterns
 * @description: 抽象文件类, 充当抽象构件类
 * @author: 黄宇辉
 * @date: 9/11/2019-1:19 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class AbstractFile {

    public abstract String getName();

    public abstract void killVirus();

    public void add(AbstractFile file) {
        throw new FileTreatMentException();
    }

}
