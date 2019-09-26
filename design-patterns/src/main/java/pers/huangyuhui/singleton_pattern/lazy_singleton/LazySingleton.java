package pers.huangyuhui.singleton_pattern.lazy_singleton;

/**
 * @project: design-patterns
 * @description: 单例模式-懒汉式单例类
 * @author: 黄宇辉
 * @date: 9/6/2019-10:50 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class LazySingleton {

    //被volatile修饰的成员变量可以确保多个线程都能够正确处理
    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块:确保任何时刻只有一个线程可执行此代码块
            synchronized (LazySingleton.class) {
                //第二重判断:防止产生多个单例对象
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
