package pers.huangyuhui.mediator_pattern.mediator_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 10/10/2019-12:58 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        //定义中介者对象
        ConcreteMediator mediator = new ConcreteMediator();

        //定义同事对象
        List list = new List();
        Button addButton = new Button();
        ComboBox comboBox = new ComboBox();
        TextBox userNameTextBox = new TextBox();

        //关联中介者
        list.setMediator(mediator);
        comboBox.setMediator(mediator);
        addButton.setMediator(mediator);
        userNameTextBox.setMediator(mediator);

        //初始化具体同事类
        mediator.list = list;
        mediator.comboBox = comboBox;
        mediator.addButton = addButton;
        mediator.userNameTextBox = userNameTextBox;

        //通过中介者进行通信
        addButton.changed(); //点击添加客户信息按钮
        list.changed(); //从列表框中选择客户
        comboBox.changed(); //从组合框中选择客户
    }
}
