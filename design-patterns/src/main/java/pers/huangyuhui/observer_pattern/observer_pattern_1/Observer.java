package pers.huangyuhui.observer_pattern.observer_pattern_1;

/**
 * @project: design-patterns
 * @description: 抽象观察者类
 * @author: 黄宇辉
 * @date: 9/29/2019-12:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public interface Observer {

    String getName();

    void setName(String name);

    void help(); //声明支援盟友的方法

    void beAttacked(AllyControllerCenter allyControllerCenter); //声明遭受攻击的方法
}
