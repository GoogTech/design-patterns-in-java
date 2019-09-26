package pers.huangyuhui.builder_pattern.builder_pattern_1;

/**
 * @project: design-patterns
 * @description: 游戏角色建造者, 充当抽象建造者
 * @author: 黄宇辉
 * @date: 9/19/2019-1:39 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildCostume();

    //工厂方法,返回一个完整的游戏角色对象
    public Actor createActor() {
        return actor;
    }
}
