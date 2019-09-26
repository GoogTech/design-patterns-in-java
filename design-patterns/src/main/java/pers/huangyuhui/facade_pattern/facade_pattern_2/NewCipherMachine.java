package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 数据加密类(移位运算), 充当子系统类
 * @author: 黄宇辉
 * @date: 9/14/2019-6:59 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class NewCipherMachine {

    public String encrypt(String text) {
        var result = "";
        var key = 10; //设置密钥,移位数为10
        for (int i = 0; i < text.length(); i++) {
            var c = text.charAt(i);
            //小写字母移位
            if (c >= 'a' && c <= 'z') {
                c += key % 26;
                if (c > 'z') {
                    c -= 26;
                }
                if (c < 'a') {
                    c += 26;
                }
            }
            //大写字母移位
            if (c >= 'A' && c <= 'Z') {
                c += key % 26;
                if (c > 'Z') {
                    c -= 26;
                }
                if (c < 'A') {
                    c += 26;
                }
                result += c;
            }
        }
        return result;
    }
}
