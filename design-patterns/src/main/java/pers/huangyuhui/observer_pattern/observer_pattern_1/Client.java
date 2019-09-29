package pers.huangyuhui.observer_pattern.observer_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/29/2019-12:31 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        //定义观察目标对象
        AllyControllerCenter allyControllerCenter = new ConcreteAllyControlCenter("YU");

        //定义四个观察者对象
        Observer player1, player2, player3, player4;
        player1 = new Player("player-A");
        allyControllerCenter.join(player1);
        player2 = new Player("player-B");
        allyControllerCenter.join(player2);
        player3 = new Player("player-C");
        allyControllerCenter.join(player3);
        player4 = new Player("player-D");
        allyControllerCenter.join(player4);

        //player-A队友遭受敌人攻击
        player1.beAttacked(allyControllerCenter);

    }
}
