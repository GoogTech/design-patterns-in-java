package pers.huangyuhui.composite_pattern.composite_pattern_2;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/11/2019-1:44 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        AbstractFile folder = new Folder("my-folder");
        AbstractFile textFolder = new Folder("text-folder");
        AbstractFile imageFolder = new Folder("image-folder");
        AbstractFile file = new TextFile("demo.text");
        AbstractFile image = new ImageFile("demo.jpg");
        textFolder.add(file);
        imageFolder.add(image);
        folder.add(textFolder);
        folder.add(imageFolder);
        folder.killVirus();
    }

}
