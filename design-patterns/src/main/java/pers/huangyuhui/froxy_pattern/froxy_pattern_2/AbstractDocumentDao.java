package pers.huangyuhui.froxy_pattern.froxy_pattern_2;

/**
 * @project: design-patterns
 * @description: 抽象文档DAO类, 充当抽象主题角色
 * @author: 黄宇辉
 * @date: 9/25/2019-1:17 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public interface AbstractDocumentDao {
    boolean deleteDocumentById(String documentId);
}
