package pers.huangyuhui.facade_pattern.facade_pattern_2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @project: design-patterns
 * @description: 文件读取类, 充当子系统类
 * @author: 黄宇辉
 * @date: 9/12/2019-9:36 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileReader {

    public String read(String path) {
        var stringBuffer = new StringBuilder();
        try (var fileInputStream = new FileInputStream(path)) {
            var data = 0;
            while ((data = fileInputStream.read()) != -1) {
                stringBuffer.append((char) data); //char
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
