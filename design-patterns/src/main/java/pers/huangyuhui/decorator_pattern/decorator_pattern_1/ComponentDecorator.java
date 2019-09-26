package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 构件装饰类, 充当抽象装饰类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:52 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ComponentDecorator extends Component {

    //维持对抽象构件类型对象的引用
    private Component component;

    //注入抽象构件类型的对象
    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}
