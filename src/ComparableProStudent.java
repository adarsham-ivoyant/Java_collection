import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding the compareTo method to sort by age

    @Override
    public int compareTo(Student other){
        return Integer.compare(this.age,other.age);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + '}';
    }
}

public class ComparableProStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 22));
        students.add(new Student("Charlie", 25));

        // Sorting the list of students
        Collections.sort(students);

        // Printing sorted list of students
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
