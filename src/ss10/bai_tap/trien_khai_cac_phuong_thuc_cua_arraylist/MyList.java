package ss10.bai_tap.trien_khai_cac_phuong_thuc_cua_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public MyList(int capacity){
        if (capacity>0){
            elements = new Object[capacity];
        } else {
            System.out.println("Error");
        }
    }

    private void add(E e){
        if (size == elements.length){

        }
    }
}
