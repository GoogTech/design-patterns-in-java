package pers.huangyuhui.mediator_pattern.mediator_pattern_2;

/**
 * @project: design-patterns
 * @description: 在新增的该中介者类, 通过覆写componentChanged()方法来实现所有组件(包括新增Label组件)之间的交互
 * @author: 黄宇辉
 * @date: 10/10/2019-1:30 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class SubConcreteMediator extends ConcreteMediator {

    //增加对Label对象的引用
    public Label label;

    @Override
    public void componentChanged(Component component) {
        //super.componentChanged(component);
        //单击按钮
        if (component == addButton) {
            System.out.println("--- 点击增加信息按钮 ---");
            list.update();
            comboBox.update();
            userNameTextBox.update();
            label.update(); //更新文本标签
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