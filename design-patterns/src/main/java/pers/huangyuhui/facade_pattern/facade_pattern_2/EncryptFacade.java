package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 加密外观类, 充当外观类
 * @author: 黄宇辉
 * @date: 9/12/2019-9:59 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class EncryptFacade extends AbstractEncryptFacade {

    //维持对子系统对象的引用
    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade() {
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    //调用子系统对象的业务方法
    public void fileEncrypt(String fromPath, String toPath) {
        var text = fileReader.read(fromPath);
        System.out.println(">>>>>>>>>> : 读取文件[ " + fromPath + " ]中的明文数据 : " + text);
        var encryptStr = cipherMachine.encrypt(text);
        System.out.println(">>>>>>>>>> : 明文数据加密后的结果 : " + encryptStr);
        fileWriter.write(encryptStr, toPath);
    }
}
