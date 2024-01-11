package generics;

import java.util.Arrays;
import java.util.List;

// Here <W extends Number> is an example of UpperBound WildCards
public class WildCardGenerics<W extends Number> {

        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public WildCardGenerics(){
            data = new Object[DEFAULT_SIZE];
        }

        // This is the main use of WildCard Generics
        public void getList(List<? extends Number> list) {
            // We can add any tasks.
        }

        public void add(W num){
            if(isFull()){
                resize();
            }
            data[size++] = num;
        }

        private void resize() {
            Object[] temp = new Object[data.length * 2];

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
        public W remove(){
            W removed = (W) (data[--size]);
            return removed;
        }

        //List also has a feature to get the item of a particular indexed item
        public W get(int index){
            return (W) data[index];
        }

        // Returning the size of an ArrayList
        public int size(){
            return size;
        }

        public void set(int index, W value){
            data[index] = value;
        }

        // In order to print the ArrayList as an Object, it needs to be Override using toString() method

        @Override
        public String toString() {
            return "WildCardGenerics{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
            WildCardGenerics<Integer> list= new WildCardGenerics<>();

            for (int i = 0; i < 15; i++) {
                list.add(3*i);
            }
            System.out.println(list);

        }
    }



