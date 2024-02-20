import java.time.LocalDateTime;
import java.util.*;

public class Appointment implements Comparator<Booking> {

    @Override
    public int compare(Booking b1, Booking b2) {
        LocalDateTime dt1 = LocalDateTime.of(0, b1.getMonth(), b1.getDay(), b1.getHour(), b1.getMin());
        LocalDateTime dt2 = LocalDateTime.of(0, b2.getMonth(), b2.getDay(), b2.getHour(), b2.getMin());

        return dt1.compareTo(dt2);
    }


//    @Override
//    public int compare(Booking b1, Booking b2) {
//        return b1.getDateTime().compareTo(b2.getDateTime());
//    }
}
