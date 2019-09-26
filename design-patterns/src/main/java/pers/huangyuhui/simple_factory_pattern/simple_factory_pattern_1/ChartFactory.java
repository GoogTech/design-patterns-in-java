package pers.huangyuhui.simple_factory_pattern.simple_factory_pattern_1;

/**
 * @project: design-patterns
 * @description: 图表工厂类, 充当工厂类
 * @author: 黄宇辉
 * @date: 9/6/2019-9:40 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ChartFactory {

    //静态工厂方法
    public static Chart getChar(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化柱状图");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化饼状图");
        } else {
            System.out.println("error : not found the object for the specified parameter");
        }
        return chart;
    }
}
