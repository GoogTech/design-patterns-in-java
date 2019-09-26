package pers.huangyuhui.decorator_pattern.decorator_pattern_1;

/**
 * @project: design-patterns
 * @description: 列表框类, 充当具体构件类
 * @author: 黄宇辉
 * @date: 9/9/2019-2:51 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ListBox extends Component {

    @Override
    public void display() {
        System.out.println("显示列表框 !");
    }
}
