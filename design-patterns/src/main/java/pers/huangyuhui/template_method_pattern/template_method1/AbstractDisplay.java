package pers.huangyuhui.template_method_pattern.template_method1;

/**
 * @project: design-patterns
 * @description: 充当抽象类角色
 * @author: 黄宇辉
 * @date: 9/4/2019-10:46 AM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class AbstractDisplay {

    //基本方法-抽象方法
    public abstract void open();

    //基本方法-抽象方法
    public abstract void print();

    //基本方法-抽象方法
    public abstract void close();

    //模板方法:为具体方法,其逻辑的组成步骤可以是具体方法或抽象方法..
    public /*final*/ void disply() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }

    //基本方法-具体方法
    //略······

    //基本方法-钩子方法
    //略······
}
