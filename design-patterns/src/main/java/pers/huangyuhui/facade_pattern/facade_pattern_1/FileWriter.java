package pers.huangyuhui.facade_pattern.facade_pattern_1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @project: design-patterns
 * @description: 文件保存类, 充当子类系统类
 * @author: 黄宇辉
 * @date: 9/12/2019-9:56 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileWriter {

    public void write(String encryptStr, String path) {
        try (var fileOutputStream = new FileOutputStream(path)) {
            fileOutputStream.write(encryptStr.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}