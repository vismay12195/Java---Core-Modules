package generics.comparablegenerics;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks){
        this.rollno = rollno;
        this.marks = marks;
    }

    public String toString(){
        return marks + " ";
    }

    @Override
    public int compareTo(Student o) {
        int diff = (int)(this.marks - o.marks);

        // if diff = 0 then both have same marks
        // if diff < 0 then o is bigger else o is smaller
        return diff;
    }
}
