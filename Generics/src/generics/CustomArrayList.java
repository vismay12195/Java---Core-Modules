// Understanding why defining size in ArrayList does not matter?
// In reality, size of an ArrayList is already fixed internally and lets assume that the ArrayList is full in case:
// then:  1. It will create another ArrayList of lets say double the size
//        2. Old elements will be copied into the new one
//        3. Old ArrayList will be deleted.

// Here I am defining the ArrayList methods separately in order to understand how those methods have been defined in
// the background and in ArrayList Class


package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //copying the current items into temp
        for(int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull(){
        return size == data.length;
    }

    // Removing the last indexed item using the size
    public int remove(){
        int removed = data[--size];
        return removed;
    }

    //List also has a feature to get the item of a particular indexed item
    public int get(int index){
        return data[index];
    }

    // Returning the size of an ArrayList
    public int size(){
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    // In order to print the ArrayList as an Object, it needs to be Override using toString() method

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);
        // This would generate an ArrayList of size 10 because of the DEFAULT_SIZE = 10
        System.out.println(list);

        // Understanding the actual use of Generics
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
    }
}
