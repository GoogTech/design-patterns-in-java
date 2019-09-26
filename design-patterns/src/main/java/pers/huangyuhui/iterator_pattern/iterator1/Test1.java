package pers.huangyuhui.iterator_pattern.iterator1;

/**
 * @project: design-patterns
 * @description: 测试类
 * @author: 黄宇辉
 * @date: 9/2/2019-5:09 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class Test1 {

    //adapter_pattern
    public static void main(String[] args) {
        BookSelf bookSelf = new BookSelf(5);
        bookSelf.appendBook(new Book("A-BOOK"));
        bookSelf.appendBook(new Book("B-BOOK"));
        bookSelf.appendBook(new Book("C-BOOK"));
        bookSelf.appendBook(new Book("D-BOOK"));
        bookSelf.appendBook(new Book("E-BOOK"));
        Iterator iterator = bookSelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
