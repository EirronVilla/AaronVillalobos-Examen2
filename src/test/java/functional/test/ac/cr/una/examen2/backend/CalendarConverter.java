package functional.test.ac.cr.una.examen2.backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Aaron
 */


public class CalendarConverter {
    public static Calendar convert(String format) throws ParseException {
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar  = Calendar.getInstance();
        calendar.setTime(sdf.parse(format));
        return calendar;
        
    } 
}
