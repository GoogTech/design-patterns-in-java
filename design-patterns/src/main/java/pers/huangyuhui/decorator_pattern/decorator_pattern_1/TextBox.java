package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 文本框类, 充当具体构件类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:50 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class TextBox extends Component {

    @Override
    public void display() {
        System.out.println("显示文本框 !");
    }
}
