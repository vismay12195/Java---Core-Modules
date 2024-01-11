package generics.comparablegenerics;

import java.util.Arrays;
import java.util.Comparator;

public class Main{

    public static void main(String[] args) {
        Student vismay = new Student(32, 60.32f);
        Student nishant = new Student(43, 61.33f);
        Student rushi = new Student(42, 65.99f);
        Student ketul = new Student(22, 69.77f);
        Student dipesh = new Student(12, 55.53f);

        Student[] all = {vismay, nishant, rushi, ketul, dipesh};

        System.out.println(Arrays.toString(all));
        // Using Comparator Constructor to do comparision and sort the array in descending order
//        Arrays.sort(all, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                // Sorting in descending order
//                return -(int)(o1.marks - o2.marks);
//            }
//        });

        //Now doing the same task with the help of lambda expression to compare the marks and sort it in ascending
        // order
        Arrays.sort(all, (o1, o2) -> (int)(o1.marks - o2.marks));
        System.out.println(Arrays.toString(all));

//        Basic comparision of both object's marks and deciding who has higher marks
//        if(vismay.compareTo(nishant) < 0){
//            System.out.println(vismay.compareTo(nishant));
//            System.out.println("Nishant has higher marks");
//        }
    }


}
