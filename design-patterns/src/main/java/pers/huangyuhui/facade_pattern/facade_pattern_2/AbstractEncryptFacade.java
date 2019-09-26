package pers.huangyuhui.facade_pattern.facade_pattern_2;

/**
 * @project: design-patterns
 * @description: 明文加密抽象类, 充当抽象外观类
 * @author: 黄宇辉
 * @date: 9/14/2019-6:54 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class AbstractEncryptFacade {
    public abstract void fileEncrypt(String fromPath, String toPath);
}
