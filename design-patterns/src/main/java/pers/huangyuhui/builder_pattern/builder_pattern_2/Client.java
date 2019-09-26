package pers.huangyuhui.builder_pattern.builder_pattern_2;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/19/2019-1:49 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        Actor zero = new HeroBuilder().construct();
        System.out.println(zero);

        System.out.println("------------------------------");

        Actor angel = new AngelBuilder().construct();
        System.out.println(angel);
    }
}
