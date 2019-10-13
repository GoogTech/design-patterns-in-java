package pers.huangyuhui.mediator_pattern.mediator_pattern_1;

/**
 * @project: design-patterns
 * @description: 列表框类, 充当具体同事类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:52 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class List extends Component {

    public void update() {
        System.out.println("列表框增加一项: 黄宇辉");
    }

    public void select() {
        System.out.println("列表框选中项: 黄浩然");
    }
}
