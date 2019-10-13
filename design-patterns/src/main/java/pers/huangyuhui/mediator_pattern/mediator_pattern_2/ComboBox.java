package pers.huangyuhui.mediator_pattern.mediator_pattern_2;

/**
 * @project: design-patterns
 * @description: 组合框类, 充当具体同事类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:55 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ComboBox extends Component {

    public void update() {
        System.out.println("组合框增加一项: 黄宇辉");
    }

    public void select() {
        System.out.println("组合框选中项: 赵艳春");
    }
}
