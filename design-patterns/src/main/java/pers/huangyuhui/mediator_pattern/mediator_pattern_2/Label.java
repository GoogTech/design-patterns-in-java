package pers.huangyuhui.mediator_pattern.mediator_pattern_2;

/**
 * @project: design-patterns
 * @description: 文本标签类, 具体同事类
 * @author: 黄宇辉
 * @date: 10/10/2019-1:30 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Label extends Component {

    public void update() {
        System.out.println("[ 文本标签内容改变,客户信息总数: +1 ]");
    }
}
