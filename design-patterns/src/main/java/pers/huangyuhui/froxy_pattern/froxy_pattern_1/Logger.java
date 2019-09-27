package pers.huangyuhui.froxy_pattern.froxy_pattern_1;

/**
 * @project: design-patterns
 * @description: 日志记录类(业务类), 提供一个log()方法来保存日志信息
 * @author: 黄宇辉
 * @date: 9/25/2019-12:57 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Logger {

    //模拟实现日志记录
    public void log(String userId) {
        System.out.println("成功更新数据库信息,ID为:[ " + userId + "+ ]的用户查询次数+1");
    }
}
