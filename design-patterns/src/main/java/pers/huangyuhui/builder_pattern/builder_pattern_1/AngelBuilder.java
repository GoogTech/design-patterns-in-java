package pers.huangyuhui.builder_pattern.builder_pattern_1;

/**
 * @project: design-patterns
 * @description: 天使角色建造者, 充当具体建造类
 * @author: 黄宇辉
 * @date: 9/19/2019-1:44 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class AngelBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("裙子");
    }
}
