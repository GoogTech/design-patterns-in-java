package pers.huangyuhui.template_method_pattern.template_method2;

/**
 * @project: design-patterns
 * @description: 充当抽象类角色
 * @author: 黄宇辉
 * @date: 9/4/2019-12:59 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class DataViewer {

    //抽象方法:获取数据
    public abstract void getData();

    //具体方法:转换数据
    private void convertData() {
        System.out.println("将数据转换为XML格式");
    }

    //抽象方法:显示数据
    public abstract void displayData();

    //钩子方法:判断是否为XML格式的数据
    public boolean isNotXMLData() {
        return true;
    }

    //模板方法
    public final void process() {
        getData();
        //如果不是xml格式的数据,则需将其转换为xml格式的数据
        if (isNotXMLData()) {
            convertData();
        }
        displayData();
    }
}
