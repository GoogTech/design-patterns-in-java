package pers.huangyuhui.observer_pattern.observer_pattern_1;

/**
 * @project: design-patterns
 * @description: 战队成员类, 充当具体观察者类
 * @author: 黄宇辉
 * @date: 9/29/2019-12:21 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Player implements Observer {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    //支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("坚持住! 队友:[ " + this.name + " ]前来支援你");
    }

    //遭受攻击方法的实现,当遭受攻击时将调用战队控制中心类的通知方法noifyObserver()来通知各个盟友
    @Override
    public void beAttacked(AllyControllerCenter allyControllerCenter) {
        System.out.println("队友: [ " + this.name + " ]正在被敌人攻击");
        allyControllerCenter.noifyObserver(name);
    }

}
