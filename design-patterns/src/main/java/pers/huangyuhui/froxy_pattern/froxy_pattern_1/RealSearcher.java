package pers.huangyuhui.froxy_pattern.froxy_pattern_1;

/**
 * @project: design-patterns
 * @description: 具体查询类, 充当真实主题角色, 它实现了查询功能
 * @author: 黄宇辉
 * @date: 9/25/2019-1:01 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class RealSearcher implements Searcher {

    //模拟查询商务信息
    @Override
    public String doSearch(String userId, String keyWord) {
        System.out.println("ID为:[ " + userId + " ]的用户使用关键字:[ " + keyWord + " ]查询了商务信息");
        return "[ 这是用户所查询的商务信息结果 ]";
    }
}
