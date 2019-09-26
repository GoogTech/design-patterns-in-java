package pers.huangyuhui.command_pattern.command_pattern_1;

/**
 * @project: design-patterns
 * @description: 登录命令类, 充当具体命令类
 * @author: 黄宇辉
 * @date: 9/20/2019-9:07 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class LoginInCommand extends Command {

    private LoginInSystem enterSystem;

    public LoginInCommand() {
        this.enterSystem = new LoginInSystem();
    }

    //命令执行方法,将调用请求接收者的业务方法
    @Override
    public void execute() {
        enterSystem.login();
    }
}
