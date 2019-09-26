package pers.huangyuhui.factory_method_pattern.factory_method3;

/**
 * @project: design-patterns
 * @description: 文件日志记录器工厂类, 充当具体工厂角色
 * @author: 黄宇辉
 * @date: 9/5/2019-9:38 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FileLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
