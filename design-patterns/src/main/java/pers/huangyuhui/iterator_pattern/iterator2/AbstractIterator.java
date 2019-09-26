package pers.huangyuhui.iterator_pattern.iterator2;

/**
 * @project: design-patterns
 * @description: 抽象迭代器
 * @author: 黄宇辉
 * @date: 9/2/2019-5:55 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public interface AbstractIterator {

    boolean hasNext();

    Object next();
}
