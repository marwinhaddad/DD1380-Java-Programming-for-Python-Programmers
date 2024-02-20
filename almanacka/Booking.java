import java.util.HashMap;
import java.lang.Integer;

public class Booking {
    String month;
    String day;
    String time;
    String activity;

    // HashMap med månader för att omvandla tex 'maj' till '05'
    private static final HashMap<String, String> m = new HashMap<>();
    static {
        m.put("jan", "01");
        m.put("feb", "02");
        m.put("mar", "03");
        m.put("apr", "04");
        m.put("maj", "05");
        m.put("jun", "06");
        m.put("jul", "07");
        m.put("aug", "08");
        m.put("sep", "09");
        m.put("okt", "10");
        m.put("nov", "11");
        m.put("dec", "12");
    }

    public Booking(String month, String day, String time, String activity) {
        this.day = day;
        this.month = month;
        this.time = time;
        this.activity = activity;
    }

    public int getMonth() {
        return Integer.parseInt(m.get(month));
    }

    public int getDay() {
        return Integer.parseInt(day);
    }

    public int getHour() {
        return Integer.parseInt(time.substring(0, 2));
    }

    public int getMin() {
        return Integer.parseInt(time.substring(3));
    }

//    // returnerar sträng av datum och tid på formatet 'MM dd hh:mm'
//    public String getDateTime() {
//        return String.format("%s %s %s", m.get(month), day, time);
//    }

    // returnerar sträng av datum, tid och aktivitet på formatet 'MMM dd hh:mm activity'
    @Override
    public String toString() {
        // "MM dd kk:mm activity"
        return String.format("%s %s %s %s", month, day, time, activity);
    }
}
