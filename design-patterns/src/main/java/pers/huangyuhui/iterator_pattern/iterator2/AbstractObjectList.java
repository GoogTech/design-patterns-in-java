package pers.huangyuhui.iterator_pattern.iterator2;

import java.util.List;

/**
 * @project: design-patterns
 * @description: 抽象聚合类
 * @author: 黄宇辉
 * @date: 9/2/2019-5:51 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public abstract class AbstractObjectList {

    protected List<Object> objects;

    public AbstractObjectList(List<Object> objects) {
        this.objects = objects;
    }

    public void addObject(Object object) {
        this.objects.add(object);
    }

    public void removeObject(Object object) {
        this.objects.remove(object);
    }

    public List<Object> getObjects() {
        return objects;
    }

    //创建迭代器的抽象工厂方法
    public abstract AbstractIterator iterator();

}
