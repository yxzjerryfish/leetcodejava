package book;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
//import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;

/**
 * MyArrayList 单元测试
 *
 * @author : Fish Paradise
 * @version 1.0
 * @date : 2019/9/23 22:07
 */
public class MyArrayListTest {
    private class node{
        Integer v;

        public node(Integer v) {
            this.v = v;
        }

        public Integer getV() {
            return v;
        }

        public void setV(Integer v) {
            this.v = v;
        }
    }

    private MyArrayList<Integer> myArrayList = new MyArrayList<>();

    private MyArrayList<node> mynodeList = new MyArrayList<>();

    @Test
    void size() {
        assert (myArrayList.size() == 0);
    }

    @Test
    void add() {
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(1);
        myArrayList.add(1);
        mynodeList.add(new node(1));
        mynodeList.add(new node(2));
        mynodeList.add(new node(3));
    }

    @Test
    void get() {
        add();
        assert (myArrayList.get(2)==3);
        assert (mynodeList.get(2).getV() ==3);
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
        mynodeList.add(3,new node(4));
        assert (mynodeList.size() == 4);
        assert (mynodeList.get(3).getV() == 4);
    }

    @Test
    void testGetIndex(){
        add();
        Integer [] a =myArrayList.getIndex(1);
        Integer [] b ={0,3,4};
        Assert.assertArrayEquals(a,b);
    }

    @Test
    void addAll(){
        add();
        MyArrayList<Integer> myArrayList2 = new MyArrayList<>();
        myArrayList2.add(1);
        myArrayList2.add(2);
        myArrayList.addAll(myArrayList2);
        assert (myArrayList.size() == 7);
    }

    @Test
    void remove(){
        add();
        myArrayList.remove(2);
        assert(myArrayList.size() == 4);
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
