package pers.huangyuhui.iterator_pattern.iterator1;

/**
 * @project: design-patterns
 * @description: 集体的迭代器
 * @author: 黄宇辉
 * @date: 9/2/2019-5:07 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class BookShelfIterator implements Iterator {

    private BookSelf bookSelf;
    private int index;

    public BookShelfIterator(BookSelf bookSelf) {
        this.bookSelf = bookSelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < bookSelf.getLength();
    }

    @Override
    public Object next() {
        return bookSelf.getBookByIndex(index++);
    }
}
