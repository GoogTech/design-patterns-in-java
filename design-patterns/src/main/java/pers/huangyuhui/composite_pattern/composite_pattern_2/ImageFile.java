package pers.huangyuhui.composite_pattern.composite_pattern_2;

/**
 * @project: design-patterns
 * @description: 图像文件类, 充当叶子构件类
 * @author: 黄宇辉
 * @date: 9/11/2019-1:27 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ImageFile extends AbstractFile {

    private String name;

    public ImageFile(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void killVirus() {
        System.out.println("——————> 对图像文件[ " + name + " ]进行杀毒");
    }
}
