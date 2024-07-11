import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamExampleConcise{
    public void filterExample(List<Integer> nums){

        //1. using 'filter()' as it is
        nums = nums.stream()
                    .filter(n -> n % 2 == 0)
                    .collect(Collectors.toList());
        // expand how filter is working and how predicate is working

        //a. Usual way of creating object of interface ~ with Annonymous class
        Predicate<Integer> p = new Predicate<Integer>() {
            public boolean test(Integer t) {
                return t % 2 == 0;
            }
            
        };

        //b. lamda expression 
        Predicate<Integer> pLambda = n -> n % 2 == 0;

        // now this PLambda holds the same expression which we generally 
        // use in filter

    }    



    public void MapExample(List<Integer> nums){
        Stream <Integer> s1 = nums.stream();
        //1. using 'map()' as it is
        nums = nums.stream()
                    .filter(n -> n % 2 == 0)
                    .map(n -> n *2)
                    .collect(Collectors.toList());
        // expand how map() is working and how predicate is working

        //a. Usual way of creating object of interface ~ with Annonymous class
        Function<Integer, Integer> p = new Function<Integer, Integer>() {
            public Integer apply(Integer t) {
                return t*2;
            }  
        };

        //b. lamda expression 
        Function<Integer, Integer> mLambda = n -> n * 2;

        // now this mLambda holds the same expression which we generally 
        // use in filter

    }
}

public class DemoStreamApi {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 5, 6, 7, 8, 3);
        System.out.println("Printing the Nums : ");
        nums.forEach(n -> System.out.println(n));
        System.out.println();
        Stream<Integer> s1 = nums.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n*2);
        int sum = s3.reduce(0, (c,e) -> c+e);
        System.out.println("Printing the sum of Stream: " + sum);
        // s3.forEach(n -> System.out.print("Prining the stream values" + n));
        System.out.println();

        int sum1 = 0;
        for(int n: nums){
            if(n % 2 == 0)
            sum1 = sum1+(n*2);
        }
        System.out.println("Printing the sum of For loop : " + sum1);

        // this for loop is doing the same job as above mentioned Stream methods.


        // we can also write all above stream methods shown in example above in one single line 
        // in very concise manner eg. 
        int result = nums.stream()
                        .filter(n -> n%2 == 0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println();
        System.out.println("Printing one liner Stream sum " + result);



    }
    
}
