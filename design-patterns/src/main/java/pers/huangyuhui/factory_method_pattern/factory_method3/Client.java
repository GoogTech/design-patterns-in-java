package pers.huangyuhui.factory_method_pattern.factory_method3;

/**
 * @project: design-patterns
 * @description: 客户端测试类(工厂方法的隐藏)
 * @author: 黄宇辉
 * @date: 9/5/2019-9:39 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        new DatabaseLoggerFactory().writeLog();
        //LoggerFactory databaseLoggerFactory = new DatabaseLoggerFactory();
        //Logger databaseLogger = databaseLoggerFactory.createLogger();
        //databaseLogger.writeLog();

        new FileLoggerFactory().writeLog();
        //LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        //Logger fileLogger = fileLoggerFactory.createLogger();
        //fileLogger.writeLog();
    }
}
