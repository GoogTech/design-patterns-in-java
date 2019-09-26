package pers.huangyuhui.facade_pattern.facade_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/14/2019-6:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    private static final String FROM_PATH = "src\\main\\java\\pers\\huangyuhui\\facade_pattern\\facade_pattern_1\\from.txt";
    private static final String TO_PATH = "src\\main\\java\\pers\\huangyuhui\\facade_pattern\\facade_pattern_1\\to.txt";

    public static void main(String[] args) {
        EncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt(FROM_PATH, TO_PATH);
    }
}
