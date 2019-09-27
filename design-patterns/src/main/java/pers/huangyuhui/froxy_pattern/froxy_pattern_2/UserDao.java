package pers.huangyuhui.froxy_pattern.froxy_pattern_2;

/**
 * @project: design-patterns
 * @description: 用户DAO类, 充当具体主题角色
 * @author: 黄宇辉
 * @date: 9/25/2019-1:18 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class UserDao implements AbstractUserDao {

    @Override
    public boolean findUserById(String userId) {
        if (userId.equalsIgnoreCase("yubuntu0109")) {
            System.out.println("成功查询ID为:[ " + userId + " ]的用户信息");
            return true;
        } else {
            System.out.println("并未查询ID为:[" + userId + " ]的用户信息");
            return false;
        }
    }
}
