package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/14/2019-6:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    private static final String FROM_PATH = "src\\main\\java\\pers\\huangyuhui\\facade_pattern\\facade_pattern_2\\from.txt";
    private static final String TO_PATH = "src\\main\\java\\pers\\huangyuhui\\facade_pattern\\facade_pattern_2\\to.txt";

    public static void main(String[] args) {
        //取模运算加密
        AbstractEncryptFacade encryptFacade = new EncryptFacade();
        encryptFacade.fileEncrypt(FROM_PATH, TO_PATH);
        //移位运算加密
        AbstractEncryptFacade newEncryptFacade = new NewEncryptFacade();
        newEncryptFacade.fileEncrypt(FROM_PATH, TO_PATH);
    }
}
