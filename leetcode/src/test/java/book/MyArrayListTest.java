package book;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;

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
        assert (myArrayList.size() == 0);
    }

    @Test
    void add() {
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
    }

    @Test
    void get() {
        add();
        assert (myArrayList.get(2)==3);
    }

    @Test
    void set() {
    }



    @Test
    void testAdd() {
        add();
        myArrayList.add(2,4);
        assert (myArrayList.size() == 4);
        assert (myArrayList.get(2) == 4);
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
