package pers.huangyuhui.singleton_pattern.IoDH_singleton;

/**
 * @project: design-patterns
 * @description: 单例模式-内部类实现单例类
 * @author: 黄宇辉
 * @date: 9/6/2019-11:11 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Singleton {
    private Singleton() {

    }

    //静态内部类
    public static class HolderClass {
        private final static Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return HolderClass.instance;
    }

}
