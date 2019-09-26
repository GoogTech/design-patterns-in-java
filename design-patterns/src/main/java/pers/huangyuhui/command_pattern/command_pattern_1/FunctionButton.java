package pers.huangyuhui.command_pattern.command_pattern_1;

/**
 * @project: design-patterns
 * @description: 功能键类, 充当请求调用者(请求发送者)
 * @author: 黄宇辉
 * @date: 9/20/2019-8:59 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class FunctionButton {

    private Command command;

    //为功能键注入命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //发送请求的方法
    public void click() {
        command.execute();
    }

}
