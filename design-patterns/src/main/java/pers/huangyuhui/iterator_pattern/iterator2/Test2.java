package pers.huangyuhui.iterator_pattern.iterator2;

import java.util.ArrayList;
import java.util.List;

/**
 * @project: design-patterns
 * @description: 测试类
 * @author: 黄宇辉
 * @date: 9/2/2019-6:13 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Test2 {

    //adapter_pattern
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        arrayList.add("A-BOOK");
        arrayList.add("B-BOOK");
        arrayList.add("C-BOOK");

        ProductList productList = new ProductList(arrayList);
        productList.addObject("D-BOOK");
        productList.addObject("E-BOOK");
        productList.removeObject("A-BOOK");

        AbstractIterator iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("all datas : " + productList.getObjects().toString());

    }
}
