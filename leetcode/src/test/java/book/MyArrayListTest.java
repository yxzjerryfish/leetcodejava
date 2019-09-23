package book;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * MyArrayList 单元测试
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/23 22:07
 */
public class MyArrayListTest {

    private MyArrayList<Integer> myArrayList = new MyArrayList<>();

    @Test
    void size() {
        Assert.assertSame(myArrayList.size() ,0);
    }

    @Test
    void add() {
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);

    }

    @Test
    void get() {
        assert (myArrayList.get(2)==2);
    }

    @Test
    void set() {
    }



    @Test
    void testAdd() {
    }

    @Test
    void iterator() {
    }

    @Test
    void forEach() {
    }

    @Test
    void spliterator() {
    }
}
