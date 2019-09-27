package pers.huangyuhui.froxy_pattern.froxy_pattern_1;

/**
 * @project: design-patterns
 * @description: 客户端测试类
 * @author: 黄宇辉
 * @date: 9/25/2019-1:13 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Client {

    public static void main(String[] args) {
        Searcher searcher = new ProxySearcher();
        System.out.println(searcher.doSearch("yubuntu0109", "design-patterns-in-java"));
    }
}
