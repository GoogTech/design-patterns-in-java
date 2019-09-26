package pers.huangyuhui.command_pattern.command_pattern_2;

import java.util.Stack;

/**
 * @project: design-patterns
 * @description: 表示"由多条命令整合成的命令"的类,充当具体的命令
 * @author: 黄宇辉
 * @date: 9/20/2019-9:27 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class MacroCommand implements Command {

    //命令的集合
    private Stack commands = new Stack();

    //执行命令
    @Override
    public void execute() {
        for (Object command : commands) {
            ((Command) command).execute();
        }
    }

    //添加命令
    public void append(Command command) {
        if (command != this) {
            commands.push(command);
        }
    }

    //清除命令
    public void clear() {
        commands.clear();
    }

}
