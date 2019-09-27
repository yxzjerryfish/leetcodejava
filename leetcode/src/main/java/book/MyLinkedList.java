package book;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * 自我创建的链表
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/27 22:05
 */
public class MyLinkedList<T> implements Iterator<T> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

    @Override
    public void remove() {

    }

    @Override
    public void forEachRemaining(Consumer<? super T> action) {

    }
}
