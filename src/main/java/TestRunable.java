/**
 * Created by Behrooz on 16/10/2017.
 */
public class TestRunable {

    public static void main(String[] args) {

        //Java 7 traditional Runnable Implementation

        Runnable javaSevenRunnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("Hello JAVA Seven Runnable");
            }
        };


        Runnable javaEightRunnable = () ->  System.out.println("Hello JAVA Eignt Runnable");

        javaSevenRunnable.run();
        javaEightRunnable.run();

    }
}
