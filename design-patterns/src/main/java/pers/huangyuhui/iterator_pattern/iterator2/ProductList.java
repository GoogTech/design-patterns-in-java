package pers.huangyuhui.iterator_pattern.iterator2;

import java.util.List;

/**
 * @project: design-patterns
 * @description: 商品书籍类, 充当具体聚合类
 * @author: 黄宇辉
 * @date: 9/2/2019-5:56 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class ProductList extends AbstractObjectList {

    public ProductList(List<Object> objects) {
        super(objects);
    }

    @Override
    public AbstractIterator iterator() {
        return new ProductIterator();
    }

    /*
    ProductIterator:商品迭代器,充当具体迭代器(使用内部类实现迭代器,与jdk中的迭代器实现原理相同)
    */
    public class ProductIterator implements AbstractIterator {

        private int cursor;

        public ProductIterator() {
            cursor = 0;
        }

        @Override
        public boolean hasNext() {
            return cursor < objects.size();
        }

        @Override
        public Object next() {
            return objects.get(cursor++);
        }
    }

}