import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Behrooz on 17/10/2017.
 */
public class PredicateExample {
    //Predicate is a functional Lambda expression


    public static void main(String[] ars){
        List<Integer> intList = Arrays.asList(1,3,4,5,6);
        System.out.println("List: " + intList);
        evaluate(intList,  n -> n%2 ==1);
    }

    public static void evaluate(List<Integer> intList, Predicate<Integer> predicate) {
        for(Integer n : intList) {
            if (predicate.test(n)) {
                System.out.println(n);
            }
        }
    }
}
