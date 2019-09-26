package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 窗体类, 充当具体构件类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:48 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Window extends Component {

    @Override
    public void display() {
        System.out.println("显示窗体 !");
    }
}
