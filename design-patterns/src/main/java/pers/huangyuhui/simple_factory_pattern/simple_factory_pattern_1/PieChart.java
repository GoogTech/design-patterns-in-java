package pers.huangyuhui.simple_factory_pattern.simple_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: 饼状图类, 充当具体产品类
 * @author: 黄宇辉
 * @date: 9/6/2019-9:38 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class PieChart implements Chart {

    public PieChart() {
        System.out.println("创建饼状图");
    }

    @Override
    public void display() {
        System.out.println("显示饼状图");
    }
}
