package pers.huangyuhui.command_pattern.command_pattern_1;

/**
 * @project: design-patterns
 * @description: 退出命令类, 充当具体命令类
 * @author: 黄宇辉
 * @date: 9/20/2019-9:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class LoginOutCommand extends Command {

    private LoginOutSystem exitSystem;

    public LoginOutCommand() {
        this.exitSystem = new LoginOutSystem();
    }

    //命令执行方法,将调用请求接受者的业务方法
    @Override
    public void execute() {
        exitSystem.exit();
    }
}
