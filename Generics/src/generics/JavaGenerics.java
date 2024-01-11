package generics;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaGenerics<G> {
        private Object[] data;
        private static int DEFAULT_SIZE = 10;
        private int size = 0;

        public JavaGenerics(){
            data = new Object[DEFAULT_SIZE];
        }

        public void add(G num){
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
        public G remove(){
            G removed = (G) (data[--size]);
            return removed;
        }

        //List also has a feature to get the item of a particular indexed item
        public G get(int index){
            return (G) data[index];
        }

        // Returning the size of an ArrayList
        public int size(){
            return size;
        }

        public void set(int index, G value){
            data[index] = value;
        }

        // In order to print the ArrayList as an Object, it needs to be Override using toString() method

        @Override
        public String toString() {
            return "JavaGenerics{" +
                    "data=" + Arrays.toString(data) +
                    ", size=" + size +
                    '}';
        }

        public static void main(String[] args) {
            JavaGenerics<Integer> list= new JavaGenerics<>();

            for (int i = 0; i < 12; i++) {
                list.add(2*i);
            }
            System.out.println(list);

        }
    }


