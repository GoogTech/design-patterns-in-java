package pers.huangyuhui.observer_pattern.observer_pattern_1;

import java.util.ArrayList;

/**
 * @project: design-patterns
 * @description: 指挥部(战队控制中心)类, 充当抽象目标类
 * @author: 黄宇辉
 * @date: 9/29/2019-12:02 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class AllyControllerCenter {

    protected String allyName;

    //定义一个集合用于存储战队成员
    protected ArrayList<Observer> players = new ArrayList<>();

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName(String allyName) {
        return allyName;
    }

    //注册方法
    public void join(Observer observer) {
        System.out.println("玩家: [ " + observer.getName() + " ]加入战队");
        players.add(observer);
    }

    //注销方法
    public void quit(Observer observer) {
        System.out.println("玩家: [ " + observer.getName() + " ]退出战队");
        players.remove(observer);
    }

    //声明抽象通知方法
    public abstract void noifyObserver(String name);
}
