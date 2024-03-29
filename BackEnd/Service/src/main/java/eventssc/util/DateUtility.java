package eventssc.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateUtility {
    public static Date getDateFromString(String dateString) throws Exception {
        DateFormat df = new SimpleDateFormat("EEE, dd MMM, yyyy", Locale.US);
        DateFormat formatter = new SimpleDateFormat("yyyy-MMM-dd", Locale.ENGLISH);
        try {
            return formatter.parse(formatter.format(df.parse(dateString)));
        } catch (Exception e){
            return new Date();
        }

    }

    public static Date getTimeFromString(String timeString) throws Exception {
        DateFormat df = new SimpleDateFormat("hh:mm a");

        try{
            return df.parse(timeString);
        } catch (Exception e){
            return new Date();
        }
    }
}
