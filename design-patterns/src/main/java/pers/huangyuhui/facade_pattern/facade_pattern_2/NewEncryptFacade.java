package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 加密外观类, 充当外观类
 * @author: 黄宇辉
 * @date: 9/14/2019-6:57 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class NewEncryptFacade extends AbstractEncryptFacade {

    private FileReader reader;
    private NewCipherMachine newCipherMachine;
    private FileWriter writer;

    public NewEncryptFacade() {
        reader = new FileReader();
        newCipherMachine = new NewCipherMachine();
        writer = new FileWriter();
    }

    //调用子系统对象的业务方法
    @Override
    public void fileEncrypt(String fromPath, String toPath) {
        String text = reader.read(fromPath);
        System.out.println(">>>>>>>>>> : 读取文件[ " + fromPath + " ]中的明文数据 : " + text);
        String encryptStr = newCipherMachine.encrypt(text);
        System.out.println(">>>>>>>>>> : 明文数据加密后的结果 : " + encryptStr);
        writer.write(encryptStr, toPath);
    }
}
