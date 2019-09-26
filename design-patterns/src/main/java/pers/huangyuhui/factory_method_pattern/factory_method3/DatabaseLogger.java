package pers.huangyuhui.factory_method_pattern.factory_method3;

/**
 * @project: design-pattern
 * @description: 数据库日志记录器, 充当具体产品角色
 * @author: 黄宇辉
 * @date: 9/5/2019-9:27 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DatabaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("this is some logs about database");
    }
}
