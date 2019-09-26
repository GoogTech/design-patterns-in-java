package pers.huangyuhui.factory_method_pattern.factory_method3;

/**
 * @project: design-patterns
 * @description: 日志记录器工厂接口, 充当抽象工厂角色(工厂方法的隐藏)
 * @author: 黄宇辉
 * @date: 9/5/2019-9:33 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class LoggerFactory {

    //工厂方法的隐藏
    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    public abstract Logger createLogger();
}
