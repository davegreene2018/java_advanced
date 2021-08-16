
package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "Monks", 23, 3.2));
        students.add(new Student("Mike", "Hamilton", 17, 1.9));
        students.add(new Student("Kate", "Sanchez", 49, 2.7));
        students.add(new Student("Olivia", "Parker", 27, 3.9));
        students.add(new Student("Peter", "Deen", 25, 2.5));
        
        Collections.sort(students);
        
        for (Student p : students) {
            System.out.println(p);
        }
    }
}
