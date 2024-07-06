import java.util.*;

/**
 *  Student imple
 */
class  Student implements Comparable<Student> {
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    public String toString() {
        return "Student [Age = " + age + ", Name = " + name + "]";
    }
    
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age){
            return 1;
        }
        else
            return -1;
    }

    
}

public class DemoCollectionsSorting {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(27, "Anuj"));
        studs.add(new Student(26, "Shweta"));
        studs.add(new Student(34, "Anil"));
        studs.add(new Student(31, "Sandeep"));

        Collections.sort(studs);
        for(Student s: studs){
            System.out.println(s);
        }

        
    }
}
