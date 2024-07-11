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

        // Comparator<Student> comp = new Comparator<Student>() {
        //     public int compare(Student i, Student j){
        //         if(i.age < j.age)
        //             return 1;
        //         else
        //             return -1;

        //     }
        // };

        // Above is normal method of creating a comparator lets use lambda for same below

        Comparator<Student> comp = ( i,  j) -> i.age < j.age ? 1 : -1;
        // above line is example of lambda using funtional interface

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(27, "Anuj"));
        studs.add(new Student(26, "Shweta"));
        studs.add(new Student(34, "Anil"));
        studs.add(new Student(31, "Sandeep"));

        Collections.sort(studs);
        for(Student s: studs){
            System.out.println("Sort method with Custom Class : " + s);
        }
        Collections.sort(studs, comp);
        for(Student s: studs){
            System.out.println("!!! Sort method with Comparator logic : " + s);
        }
        
    }
}
