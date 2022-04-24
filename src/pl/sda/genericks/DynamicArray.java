package pl.sda.genericks;

import java.util.Arrays;

public class DynamicArray<T> {

    private T[] array = (T[]) new Object[2];

    private int index = 0;

    public void add(T type){
        esureCapacity();
        array[index++] = type;



    }

    private void esureCapacity(){
        if (index == array.length){
            array = Arrays.copyOf(array, array.length*2);
            System.out.println("New array size: " + array.length);
        }
    }
    public void print(){
        for (int i = 0; i<index; i++){
            System.out.println(array[i]);
        }
    }


}
