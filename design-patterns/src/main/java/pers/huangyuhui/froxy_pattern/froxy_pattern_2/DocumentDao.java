package pers.huangyuhui.froxy_pattern.froxy_pattern_2;

/**
 * @project: design-patterns
 * @description: 文档DAO类, 充当具体主题角色
 * @author: 黄宇辉
 * @date: 9/25/2019-1:21 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class DocumentDao implements AbstractDocumentDao {

    @Override
    public boolean deleteDocumentById(String documentId) {
        if (documentId.equalsIgnoreCase("Y001")) {
            System.out.println("成功删除ID为:[ " + documentId + " ]的文档信息");
            return true;
        } else {
            System.out.println("并未找到ID为:[ " + documentId + " ]的文档信息");
            return false;
        }
    }
}
