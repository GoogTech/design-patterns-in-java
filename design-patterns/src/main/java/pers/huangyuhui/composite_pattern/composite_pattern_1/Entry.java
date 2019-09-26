package pers.huangyuhui.composite_pattern.composite_pattern_1;

/**
 * @project: design-patterns
 * @description: 表示目录条目的抽象类, 充当Component角色
 * @author: 黄宇辉
 * @date: 9/11/2019-12:16 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class Entry {

    public abstract String getName();

    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatMentException {
        throw new FileTreatMentException();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}