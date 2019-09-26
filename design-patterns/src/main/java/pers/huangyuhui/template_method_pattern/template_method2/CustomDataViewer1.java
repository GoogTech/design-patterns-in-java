package pers.huangyuhui.template_method_pattern.template_method2;

/**
 * @project: design-patterns
 * @description: 充当具体类
 * @author: 黄宇辉
 * @date: 9/4/2019-1:05 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class CustomDataViewer1 extends DataViewer {

    @Override
    public void getData() {
        System.out.println("从XML文件中获取数据");
    }

    @Override
    public void displayData() {
        System.out.println("以柱状图的方式显示数据");
    }

    //覆盖父类的钩子方法
    @Override
    public boolean isNotXMLData() {
        //return super.isNotXMLData();
        return false;
    }
}
