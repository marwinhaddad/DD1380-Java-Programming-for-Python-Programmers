import java.util.*;

public class Almanacka {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Antal aktiviteter
        int n = Integer.parseInt(sc.nextLine());

        // lista med bokningsobjekt
        List<Booking> bookingList = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            // läser inmatning och splittar sträng på mellanslag
            String[] app = sc.nextLine().split("\\s+");

            // MMM = månad, dd = dag, T = tid, activity = aktivitet
            String MMM = app[0];
            String dd = app[1];
            String T = app[2];
            String activity = String.join(" ", Arrays.copyOfRange(app, 3, app.length));

            // skapar och appendar bokningsobjekt för varje bokning/ i inmatningen
            bookingList.add(new Booking(MMM, dd, T, activity));
        }

        // sorterar bokningsobjekten efter datum och tid
        bookingList.sort(new Appointment());

        // printar ordnade bokningar
        for (Booking b : bookingList) {
            System.out.println(b);
        }
    }
}
