
package comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PersonExample {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("John", 23));
        people.add(new Person("Mike", 17));
        people.add(new Person("Kate", 49));
        people.add(new Person("Olivia", 27));
        
        Collections.sort(people);
        
        for (Person people1 : people) {
            System.out.println(people1);
        }
    }
    
}
