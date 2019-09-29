package pers.huangyuhui.observer_pattern.observer_pattern_1;

/**
 * @project: design-patterns
 * @description: 具体指挥部类, 充当具体目标类
 * @author: 黄宇辉
 * @date: 9/29/2019-12:16 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ConcreteAllyControlCenter extends AllyControllerCenter {

    public ConcreteAllyControlCenter(String allyName) {
        this.allyName = allyName;
        System.out.println("------ 战队: [ " + allyName + " ]组建成功 ------");
    }

    //实现通知方法
    @Override
    public void noifyObserver(String name) {
        System.out.println("战队: [ " + this.allyName + " ]指挥部发送的紧急通知 : 队友[ " + name + " ]正在遭受敌人攻击");
        //遍历观察者集合,调用每一个队友(除自己)的支援方法
        for (Observer player : players) {
            if (!(player.getName().equalsIgnoreCase(name))) {
                player.help();
            }
        }
    }
}
