package pers.huangyuhui.froxy_pattern.froxy_pattern_1;

/**
 * @project: design-patterns
 * @description: 代理查询类, 充当代码主题角色, 它是查询代理, 维持了对RealSearcher, AccessValidator, 及Logger对象的引用
 * @author: 黄宇辉
 * @date: 9/25/2019-1:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ProxySearcher implements Searcher {

    private RealSearcher realSearcher = new RealSearcher(); //维持一个对真实主题的引用
    private AccessValidator accessValidator;
    private Logger logger;

    @Override
    public String doSearch(String userId, String keyWord) {
        //如果身份验证成功,则执行查询操作
        if (this.validate(userId)) {
            String result = realSearcher.doSearch(userId, keyWord); //调用真实主题的查询方法
            this.log(userId); //记录查询日志
            return result;
        } else {
            return null;
        }
    }

    //创建访问验证对象并调用其validate()方法来实现身份验证
    public boolean validate(String userId) {
        accessValidator = new AccessValidator();
        return accessValidator.validate(userId);
    }

    //创建日志记录对象并调用其log()方法来实现日志记录
    public void log(String userId) {
        logger = new Logger();
        logger.log(userId);
    }
}
