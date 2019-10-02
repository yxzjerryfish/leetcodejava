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

    private Integer size;

    /**
     * 在调用主体的新增，修改，删除，清空等方法时增加
     * 在调用迭代器的next和remove时进行判断，如果和外部的不一致
     * 说明在调用迭代器的过程中进行了修改，则抛出{{@link java.util.ConcurrentModificationException}}
     */
    private Integer modcount = 0;

    private Node<T> head;

    private Node<T> tail;

    public void clear(){
        head = new Node<T>(null,null,null);
        tail = new Node<T>(null,head,null);
        head.next = tail;

        this.size =0;
        modcount++ ;
    }

    public MyLinkedList(){
        super();
        clear();
    }

    public void addBefore(Node<T> p,T x){
        Node<T> node = new Node<>(x,p.prev,p);
        node.prev.next = node;
        p.prev = node;
        size++;
        modcount++;
    }

    public void addAfter(Node<T> p, T x){
        Node<T> node = new Node<>(x,p,p.next);
        p.next.prev = node;
        p.next = node;
        size++;
        modcount++;
    }

    public T remove(Node<T> p){
        p.next.prev = p.prev;
        p.prev.next = p.next;

        size--;
        modcount++;
        return p.data;
    }

    private class Node<T>{
        public T data;
        public Node<T> prev;
        public Node<T> next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

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
