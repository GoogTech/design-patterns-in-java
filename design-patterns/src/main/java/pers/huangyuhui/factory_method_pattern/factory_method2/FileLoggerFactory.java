package pers.huangyuhui.factory_method_pattern.factory_method2;

/**
 * @project: design-patterns
 * @description: 文件日志记录器工厂类, 充当具体工厂角色-工厂方法模式之工厂方法的重载
 * @author: 黄宇辉
 * @date: 9/5/2019-9:38 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }

    @Override
    public Logger createLogger(String args) {
        return null;
    }

    @Override
    public Logger createLogger(Object obj) {
        return null;
    }

}
