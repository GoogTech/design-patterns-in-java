package pers.huangyuhui.singleton_pattern.eager_singleton;

/**
 * @project: design-patterns
 * @description: 单例模式-饿汉式单例类
 * @author: 黄宇辉
 * @date: 9/6/2019-10:44 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
