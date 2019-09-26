package pers.huangyuhui.factory_method_pattern.factory_method2;

/**
 * @project: design-patterns
 * @description: 数据库日志记录器工厂类, 充当具体工厂角色(工厂方法的重载)
 * @author: 黄宇辉
 * @date: 9/5/2019-9:36 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }

    @Override
    public pers.huangyuhui.factory_method_pattern.factory_method2.Logger createLogger(String args) {
        System.out.println("使用参数" + args + "作为连接字符串来连接数据库,代码省略 ···");
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器,代码省略 ···
        return new DatabaseLogger();
    }

    @Override
    public pers.huangyuhui.factory_method_pattern.factory_method2.Logger createLogger(Object obj) {
        System.out.println("使用封装在" + obj.toString() + "中的连接字符串来连接数据库,代码省略 ···");
        Logger logger = new DatabaseLogger();
        //使用封装在参数obj中的数据来初始化数据库日志记录器，代码省略 ···
        return logger;
    }
}
