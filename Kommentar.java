import java.util.*;

public class Kommentar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StringBuffer buf = new StringBuffer();
        while ( scan.hasNextLine() ) {
            buf.append( scan.nextLine() );
            buf.append( "\n" );
        }

        String s = buf.toString();

        try {

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '%') {
                    i += 1;
                    while (s.charAt(i) != '%') {
                        i += 1;
                    }

                } else if (s.charAt(i) == '/' && s.charAt(i+1) == '*') {
                    i += 2;
                    while (true) {
                        if (s.charAt(i) == '*' && s.charAt(i+1) == '/') {
                            i += 1;
                            break;
                        }
                        i += 1;
                    }

                } else {
                    System.out.print(s.charAt(i));
                }
            }
        } catch (Exception ignored) {}
    }
}
