package pers.huangyuhui.iterator_pattern.iterator1;

/**
 * @project: design-patterns
 * @description: 具体的集合
 * @author: 黄宇辉
 * @date: 9/2/2019-5:03 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public class BookSelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookSelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookByIndex(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
