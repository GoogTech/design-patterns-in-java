package pers.huangyuhui.composite_pattern.composite_pattern_1;

import java.util.ArrayList;

/**
 * @project: design-patterns
 * @description: 表示文件夹的类, 充当Composite角色
 * @author: 黄宇辉
 * @date: 9/11/2019-12:25 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Directory extends Entry {

    private String name;
    private ArrayList<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        var size = 0;
        for (Entry entry : directory) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this.toString());
        for (Entry entry : directory) {
            entry.printList(prefix + "/" + name);
        }
    }
}
