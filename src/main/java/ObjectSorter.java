import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Behrooz on 16/10/2017.
 */
public class ObjectSorter {

    public void sortWithJavaEight(List<String> cities) {
        System.out.println("-----------------------sortWithJavaEight----------------------");
        Collections.sort(cities, (str_1, str_2 ) -> str_1.compareTo(str_2));

        for(String city : cities){
            System.out.println("City Name: " + city);
        }

    }

    public void sortWithJavaSeven(List<String> cities){
        System.out.println("------------------------sortWithJavaSeven-------------------");

        Collections.sort(cities, new Comparator<String>(){

            @Override
            public int compare(String str_1, String str_2){
                return(str_1.compareTo(str_2));
            }

        });
        for(String city : cities){
            System.out.println("City Name: " + city);
        }

    }


    public static void main(String[] args) {
        ObjectSorter objectSorter = new ObjectSorter();
        List<String> cities = new ArrayList<String>();
        cities.add("New York");
        cities.add("London");
        cities.add( "Madrid");
        cities.add("Rome");
        objectSorter.sortWithJavaSeven(cities);
        objectSorter.sortWithJavaEight(cities);
    }




}
