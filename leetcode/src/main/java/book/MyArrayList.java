package book;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * 基础太差，所以把书重新拿出来再学一遍
 * 自我实现MyArrayList泛型类，实现功能如下：
 *  1。Iterable 接口实现
 *  2.get、set实现
 *  3.add方法新增，返回新数组，add在指定位置新增
 *  4.copy方法
 *  5. addAll 批量新增方法
 *  6. size,isEmpty,clear,remove 方法
 *  7. 返回一个Iterator接口
 *  8. 根据内容返回下标
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/23 20:36
 */
@SuppressWarnings("unchecked")
public class MyArrayList<T> implements Iterable<T> {
    private Integer size = 0;
    private T[] innerElement = (T[]) new Object[0];

    private void instance(Integer size){
        if (size>= this.size){
            this.size = size;
            T [] old = innerElement;
            this.innerElement = (T[])new Object[size];
            System.arraycopy(old, 0, this.innerElement, 0, old.length);
        }
    }

    /**
     * 获取size
     * @return 获取size
     */
    public Integer size() {
        return this.size;
    }

    public Boolean isEmpty(){return this.size == 0;}

    public void clear(){
        this.size = 0;
        this.innerElement = (T[]) new Object[0];
    }
    /**
     * 根据下标获取对应元素
     * @param index 下标
     * @return 根据下标获取对应元素
     */
    public T get(Integer index){
        if (index > size || index <0){
            throw new ArrayIndexOutOfBoundsException("Index overflow !");
        }
        return this.innerElement[index];
    }

    public Integer[] getIndex(T t){
        Integer []s = new Integer[this.size];
        int j = 0;
        for (int i = 0;i<this.size;i++){
            if(this.innerElement[i].equals(t)){
                s[j++] = i;
            }
        }
        Integer []s1 = new Integer[j];
        System.arraycopy(s,0,s1,0,j);
        return s1;
    }

    /**
     * 根据下标替换元素
     * @param index 下标
     * @param t 替换元素
     * @return 被替换元素
     */
    public T set(Integer index,T t){
        if (index > size || index <0){
            throw new ArrayIndexOutOfBoundsException("Index overflow !");
        }
        T st = this.innerElement[index];
        this.innerElement[index] = t;
        return st;
    }

    /**
     *  在末尾添加元素
     * @param t 元素
     */
    public void add(T t){
        add(this.size,t);
    }

    /**
     * 指定位置添加元素
     * @param index 指定位置
     * @param t 元素
     */
    public void add(Integer index,T t){
        if (index > size){
            throw new ArrayIndexOutOfBoundsException("Index overflow !");
        }
        instance(this.size+1);
        if(index<size-1){
            System.arraycopy(this.innerElement, index-1, this.innerElement, index , this.size - index);
        }
        this.innerElement[index] = t;
    }

    public MyArrayList<T> addAll(MyArrayList<T> arrayList){
        instance(this.size + arrayList.size());
        System.arraycopy(arrayList.innerElement,0,this.innerElement,this.size - arrayList.size,arrayList.size);
        return this ;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
