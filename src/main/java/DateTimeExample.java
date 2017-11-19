import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Created by Behrooz on 14/11/2017.
 */
public class DateTimeExample {

    public static void main(String[] args) {
        DateTimeExample dateTimeExample = new DateTimeExample();
        dateTimeExample.processLocalDateTime();
        dateTimeExample.getParticularDayOfWeek(-577,3,20);
    }

    public void processLocalDateTime() {
        LocalDateTime currentTime = LocalDateTime.now();
        displayDatetime(currentTime);


        System.out.println("Parsing date from a String");

        //LocalDateTime  stringPresentedDate = LocalDateTime.parse("10/06/1978");
        //displayDatetime(stringPresentedDate);

    }

    public void getParticularDayOfWeek(int year, int month, int day) {
        LocalDateTime dateTime = LocalDateTime.of(year,month,day,0,0,0);
        DayOfWeek dayOfweek = dateTime.getDayOfWeek();
        System.out.println("day Of week was: " + dayOfweek);


    }


    private void displayDatetime(LocalDateTime currentTime){
        int year = currentTime.getYear();
        int dayOfMonth = currentTime.getDayOfMonth();
        DayOfWeek dayOfweek = currentTime.getDayOfWeek();
        int hour = currentTime.getHour();
        int min = currentTime.getMinute();
        int sec = currentTime.getSecond();

        System.out.println("year: " + year);
        System.out.println("dayOfMonth: " + dayOfMonth);
        System.out.println("dayOfweek: " + dayOfweek);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + min);
        System.out.println("second: " + sec);

    }



}
