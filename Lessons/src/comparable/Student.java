
package comparable;

public class Student implements Comparable<Student>{
    public String Fname;
    public String Lname;
    public int age; 
    public double GPA; 

    public Student(String Fname, String Lname, int age, double GPA) {
        this.Fname = Fname;
        this.Lname = Lname;
        this.age = age;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" + "Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + ", GPA=" + GPA + '}';
    }

    @Override
    public int compareTo(Student o) {
        String name = Fname + Lname;
        String nameO = o.Fname + o.Lname;
        System.out.println("I am comparing " + name + " with " + nameO);
        if(name.length() == nameO.length()){
            if(this.GPA == o.GPA)
                return 0;
            else if(GPA < o.GPA)
                return -1;
            else 
                return 1;
        }
            //return 0;
        else if(name.length() < nameO.length())
            return -1;
        else 
            return 1;
    }
    
    
}
