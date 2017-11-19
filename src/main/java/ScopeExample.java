/**
 * Created by Behrooz on 17/10/2017.
 */
public class ScopeExample {

    static final String greating = "Hell0 ";
    public static void main(String[] args) {

        GreetingService  greetingService = message -> System.out.println(greating + message + " What the FUCK is going on here");

        greetingService.greet("JAVA 8!");
    }

    public interface GreetingService {
        void greet(String message);

    }
}
