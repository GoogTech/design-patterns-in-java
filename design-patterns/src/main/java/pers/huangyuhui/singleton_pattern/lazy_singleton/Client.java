package pers.huangyuhui.singleton_pattern.lazy_singleton;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/6/2019-10:52 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance()); //true
    }
}
