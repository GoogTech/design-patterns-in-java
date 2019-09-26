package pers.huangyuhui.builder_pattern.builder_pattern_1;

/**
 * @project: design-patterns
 * @description: 角色控制器, 充当指挥者
 * @author: 黄宇辉
 * @date: 9/19/2019-1:46 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ActorController {

    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder actorBuilder) {
        Actor actor;
        actorBuilder.buildType();
        actorBuilder.buildSex();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actor = actorBuilder.createActor();
        return actor;
    }
}
