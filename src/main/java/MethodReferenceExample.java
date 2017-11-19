import java.util.ArrayList;
import java.util.List;

/**
 * Created by Behrooz on 17/10/2017.
 */
public class MethodReferenceExample {

    public static void main (String[] args){

        List<String> namesList = new ArrayList<String>();

        namesList.add("Bruce");
        namesList.add("Laleh");
        namesList.add("Areya");
        namesList.add("Atoosa");

        namesList.forEach(System.out :: println);

    }
}
