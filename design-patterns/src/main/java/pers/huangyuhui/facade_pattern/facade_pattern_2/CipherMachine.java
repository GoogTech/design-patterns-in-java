package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 数据加密类(求模运算), 充当子系统类
 * @author: 黄宇辉
 * @date: 9/12/2019-9:42 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class CipherMachine {

    public String encrypt(String text) {
        var result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            var s = String.valueOf(text.charAt(i) % 7);
            result.append(s);
        }
        return result.toString();
    }
}
