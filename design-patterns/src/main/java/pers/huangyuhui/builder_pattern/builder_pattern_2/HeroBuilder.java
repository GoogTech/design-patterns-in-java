package pers.huangyuhui.builder_pattern.builder_pattern_2;

/**
 * @project: design-patterns
 * @description: 英雄角色建造者, 充当具体建造者
 * @author: 黄宇辉
 * @date: 9/19/2019-1:42 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }
}
