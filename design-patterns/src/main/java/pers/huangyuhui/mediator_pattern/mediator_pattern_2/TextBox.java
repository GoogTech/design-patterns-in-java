package pers.huangyuhui.mediator_pattern.mediator_pattern_2;

/**
 * @project: design-patterns
 * @description: 文本框, 充当具体同事类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:56 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class TextBox extends Component {

    public void update() {
        System.out.println("客户信息增加成功后文本被清空");
    }

    public void setText() {
        System.out.println("文本框显示: 赵艳春");
    }
}
