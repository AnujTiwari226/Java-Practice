// example for collection with list set and other collections classes
import java.util.*;

/**
 * InnerDemoCollections
 */
class InnerDemoCollections {

    public static void getNumsFromSetCollection() {        
        // Set<Integer> snums = new HashSet<Integer>();
        Set<Integer> snums = new TreeSet<Integer>();
            snums.add(10);
            snums.add(50);
            snums.add(30);
            snums.add(60);
        // hashset is unordered use TreeSet for ordered set
        // snums.add(10) -- can't add it in to set and it is already available
         for (int i : snums){
            System.out.println("Set Value : " + i);
         }
    }



    public static void getNumsFromListCollection() {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        for(int i : nums){
            System.out.println("List Values : " + i);
        } 
        System.out.println("Get element at index 2:  "+ nums.get(2));
        System.out.println("Get index value of element 40 : " + nums.indexOf(40));
    }



    public static void getNumsFromIteratorCollections(){
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        Iterator<Integer> inums = nums.iterator();
        while(inums.hasNext()){
            System.out.println("Iterator Values : " + inums.next());
        }
    }



    public static void MapExample(){
        Map<String, Integer> students = new HashMap<>();
        students.put("Anuj", 50);
        students.put("Shweta", 90);
        students.put("Baahu", 40);
        students.put("Dharm", 60);

        System.out.println(students);

         /* keys can't be repeated in map, if we add value to a existing
         key it'll replace it in existing key */

    }
    

    public static void CollectionsMethodsExample(){
         List<Integer> nums = new ArrayList<>();
         nums.add(10);
         nums.add(20);
         nums.add(15);
         nums.add(40);
         nums.add(30);
        System.out.println("Inside CollectionsMethodsExample method. ");
        System.out.println(" Orginal List Befor Sorting : " + nums);
        Collections.sort(nums);
        System.out.println(" Sorted : " + nums);

        // can use compartor for sorting the list according to 
        // our custom logic

        Comparator<Integer>comp = new Comparator<Integer>() {
            public int compare(Integer i, Integer j){
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
            
        };
        nums.clear();
        nums.add(45);
        nums.add(13);
        nums.add(25);
        nums.add(11);
        nums.add(42);
        nums.add(51);
        System.out.println(" New List Befor Sorting : " + nums);
        Collections.sort(nums, comp);
        System.out.println(" Sorted according to comp : " + nums);


    }

}
public class DemoCollectionsBasics {
    public static void main(String[] args) {
        InnerDemoCollections.getNumsFromListCollection();
        InnerDemoCollections.getNumsFromSetCollection();
        InnerDemoCollections.getNumsFromIteratorCollections();
        InnerDemoCollections.MapExample();
        InnerDemoCollections.CollectionsMethodsExample();


    }


}
