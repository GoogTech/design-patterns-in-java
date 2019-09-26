package pers.huangyuhui.builder_pattern.builder_pattern_1;

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
        ActorController actorController = new ActorController();

        ActorBuilder zero = new HeroBuilder();
        Actor actor_zero = actorController.construct(zero);
        System.out.println(actor_zero);

        System.out.println("------------------------------");

        ActorBuilder angel = new AngelBuilder();
        Actor actor_angel = actorController.construct(angel);
        System.out.println(actor_angel);
    }
}
