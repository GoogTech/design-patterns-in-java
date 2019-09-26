package pers.huangyuhui.singleton_pattern.IoDH_singleton;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/6/2019-11:14 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance()); //ture
    }
}
