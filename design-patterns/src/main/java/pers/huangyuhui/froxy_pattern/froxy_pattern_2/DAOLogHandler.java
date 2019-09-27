package pers.huangyuhui.froxy_pattern.froxy_pattern_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Timer;

/**
 * @project: design-patterns
 * @description: 自定义请求处理程序类
 * @author: 黄宇辉
 * @date: 9/25/2019-1:24 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DAOLogHandler implements InvocationHandler {

    private Object object;

    public DAOLogHandler() {
    }

    //注入一个需要提供代理的真实主题对象
    public DAOLogHandler(Object object) {
        this.object = object;
    }

    public void beforeInvoke() {
        System.out.println("------> invoke before: " + new Date().toString());
    }

    public void afterInvoke() {
        System.out.println("------> invoke after: " + new Date().toString());
    }

    //实现invoke()方法,调用在真实主题类中定义的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args); //转发调用
        afterInvoke();
        return result;
    }
}
