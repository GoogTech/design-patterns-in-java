package pers.huangyuhui.composite_pattern.composite_pattern_1;

/**
 * @project: design-patterns
 * @description: 自定义异常类
 * @author: 黄宇辉
 * @date: 9/11/2019-12:19 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileTreatMentException extends RuntimeException {

    public FileTreatMentException() {

    }

    public FileTreatMentException(String msg) {
        super(msg);
    }
}
