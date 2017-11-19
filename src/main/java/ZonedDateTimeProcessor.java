import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * Created by Behrooz on 15/11/2017.
 */
public class ZonedDateTimeProcessor {

    public static void main(String[] args) {
        ZonedDateTimeProcessor onedDateTimeProcessor = new ZonedDateTimeProcessor();

        onedDateTimeProcessor.processCurrentZone();
        onedDateTimeProcessor.processRequestedTimeZone("asia/Pacific" , "");


    }

    public void  processCurrentZone() {

    }

    public void processRequestedTimeZone(String timeZone, String dateString) {
        ZonedDateTime date_1 = ZonedDateTime.parse(timeZone);
        displayDatetime(date_1);


    }
    private void displayDatetime(ZonedDateTime currentZonDateTime){
        int year = currentZonDateTime.getYear();
        int dayOfMonth = currentZonDateTime.getDayOfMonth();
        DayOfWeek dayOfweek = currentZonDateTime.getDayOfWeek();
        int hour = currentZonDateTime.getHour();
        int min = currentZonDateTime.getMinute();
        int sec = currentZonDateTime.getSecond();

        System.out.println("year: " + year);
        System.out.println("dayOfMonth: " + dayOfMonth);
        System.out.println("dayOfweek: " + dayOfweek);
        System.out.println("hour: " + hour);
        System.out.println("minute: " + min);
        System.out.println("second: " + sec);

    }

}
