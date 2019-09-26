package pers.huangyuhui.composite_pattern.composite_pattern_2;

import java.util.ArrayList;

/**
 * @project: design-patterns
 * @description: 文件夹类, 充当容器构件类
 * @author: 黄宇辉
 * @date: 9/11/2019-1:38 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Folder extends AbstractFile {

    private String name;
    private ArrayList<AbstractFile> directory = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(AbstractFile file) {
        directory.add(file);
    }

    @Override
    public void killVirus() {
        System.out.println("======> 对文件夹[ " + name + " ]进行杀毒");
        //递归调用成员构件的killVirus方法
        for (AbstractFile abstractFile : directory) {
            abstractFile.killVirus();
        }
    }
}
