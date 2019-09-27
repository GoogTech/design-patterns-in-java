package pers.huangyuhui.froxy_pattern.froxy_pattern_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/25/2019-1:29 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        InvocationHandler handler = new DAOLogHandler(new UserDao());
        AbstractUserDao proxy = (AbstractUserDao) Proxy.newProxyInstance(AbstractUserDao.class.getClassLoader(), new Class[]{AbstractUserDao.class}, handler);
        proxy.findUserById("yubuntu0109");

        System.out.println("------------------------------");

        InvocationHandler handler2 = new DAOLogHandler(new DocumentDao());
        AbstractDocumentDao proxy2 = (AbstractDocumentDao) Proxy.newProxyInstance(AbstractDocumentDao.class.getClassLoader(), new Class[]{AbstractDocumentDao.class}, handler2);
        proxy2.deleteDocumentById("Y001");
    }
}
