package week1;
import java.util.ArrayList;

public class PesronListExemple {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("John", 27));
        
        for (Person person : personList) {
            System.out.println(person);
        }
    }
}
