package pers.huangyuhui.command_pattern.command_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/20/2019-9:11 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        FunctionButton functionButton = new FunctionButton();
        Command login_key = new LoginInCommand();
        functionButton.setCommand(login_key);
        functionButton.click();

        System.out.println("--------------------");

        Command exit_key = new LoginOutCommand();
        functionButton.setCommand(exit_key);
        functionButton.click();
    }
}
