package pers.huangyuhui.composite_pattern.composite_pattern_1;

/**
 * @project: design-patterns
 * @description: 表示文件的类, 充当Leaf角色
 * @author: 黄宇辉
 * @date: 9/11/2019-12:22 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
    }
}
