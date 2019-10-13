package pers.huangyuhui.mediator_pattern.mediator_pattern_1;

/**
 * @project: design-patterns
 * @description: 抽象组件类, 充当抽象同事类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:51 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class Component {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    //转发调用
    public void changed() {
        mediator.componentChanged(this);
    }

    public abstract void update();
}
