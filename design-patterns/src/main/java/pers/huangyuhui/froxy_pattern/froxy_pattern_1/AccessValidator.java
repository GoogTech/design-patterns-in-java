package pers.huangyuhui.froxy_pattern.froxy_pattern_1;

/**
 * @project: design-patterns
 * @description: 身份验证类(业务类), 它提供validate()方法来实现用户身份的验证
 * @author: 黄宇辉
 * @date: 9/25/2019-12:53 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class AccessValidator {

    //模拟实现登录验证
    public boolean validate(String userId) {
        if (userId.equalsIgnoreCase("yubuntu0109")) {
            System.out.println("ID为:[ " + userId + " ]的用户登录成功");
            return true;
        } else {
            System.out.println("ID为:[ " + userId + " ]的用户登录失败");
            return false;
        }
    }
}
