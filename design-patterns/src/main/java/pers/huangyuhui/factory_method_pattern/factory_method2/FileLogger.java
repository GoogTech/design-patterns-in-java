package pers.huangyuhui.factory_method_pattern.factory_method2;

/**
 * @project: design-patterns
 * @description: 文件日志记录器,充当具体产品角色
 * @author: 黄宇辉
 * @date: 9/5/2019-9:30 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("this is some logs about file");
    }
}
