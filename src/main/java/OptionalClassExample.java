import java.util.Optional;

/**
 * Created by Behrooz on 13/11/2017.
 */
public class OptionalClassExample {

    public Integer addNumbers(Integer num_1, Integer num_2) {

        Optional<Integer> intValue_1=  Optional.ofNullable(num_1);
        Optional<Integer> intValue_2=  Optional.ofNullable(num_2);

        System.out.println(intValue_1.isPresent());
        System.out.println(intValue_2.isPresent());

        Integer val_1 = intValue_1.orElse(new Integer(0));
        Integer val_2 = intValue_2.orElse(new Integer(0));
        return (val_1 + val_2);


    }

    public String addStrings(String str_1, String str_2) {

        Optional<String> StringValue_1=  Optional.ofNullable(str_1);
        Optional<String> StringValue_2=  Optional.ofNullable(str_2);

        System.out.println(StringValue_1.isPresent());
        System.out.println(StringValue_2.isPresent());

        String String_1 = StringValue_1.orElse(new String());
        String String_2 = StringValue_2.orElse(new String());

        return (String_1 + String_2);

    }

    public static void main(String[] args) {
        OptionalClassExample optionalClassExample = new OptionalClassExample();

        Integer num_1 =30;
        Integer num_2 =70;

        Integer result = optionalClassExample.addNumbers(num_1, num_2);

        System.out.println("The optional Sum result is : " + result);


        String str_1 = "Kheily";
        String str_2 = null;

        String resultStr = optionalClassExample.addStrings(str_1, str_2);

        System.out.println("The result String is: " + resultStr);


    }
}
