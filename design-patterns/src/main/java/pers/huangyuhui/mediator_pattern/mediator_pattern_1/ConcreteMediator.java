package pers.huangyuhui.mediator_pattern.mediator_pattern_1;

/**
 * @project: design-patterns
 * @description: 具体中介者类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:50 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ConcreteMediator extends Mediator {

    //维持对各个同事对象的引用
    public List list;
    public Button addButton;
    public TextBox userNameTextBox;
    public ComboBox comboBox;

    //封装同事对象之间的交互
    @Override
    public void componentChanged(Component component) {
        //单击按钮
        if (component == addButton) {
            System.out.println("--- 点击增加信息按钮 ---");
            list.update();
            comboBox.update();
            userNameTextBox.update();
        }
        //从列表框选择客户
        else if (component == list) {
            System.out.println("\n--- 从列表框选择客户 ---");
            list.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (component == comboBox) {
            System.out.println("\n--- 从组合框选择客户 ---");
            comboBox.select();
            userNameTextBox.setText();
        }
    }
}
