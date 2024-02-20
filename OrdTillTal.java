import java.util.*;

public class OrdTillTal {

    public static void main(String[] args) {
        String word;
        long current = 0;
        long total = 0;

        Scanner sc = new Scanner(System.in);

        HashMap <String, Integer> numdict = new HashMap <>();
        numdict.put("en", 1);
        numdict.put("ett", 1);
        numdict.put("två", 2);
        numdict.put("tre", 3);
        numdict.put("fyra", 4);
        numdict.put("fem", 5);
        numdict.put("sex", 6);
        numdict.put("sju", 7);
        numdict.put("åtta", 8);
        numdict.put("nio", 9);
        numdict.put("tio", 10);
        numdict.put("elva", 11);
        numdict.put("tolv", 12);
        numdict.put("tretton", 13);
        numdict.put("fjorton", 14);
        numdict.put("femton", 15);
        numdict.put("sexton", 16);
        numdict.put("sjutton", 17);
        numdict.put("arton", 18);
        numdict.put("nitton", 19);
        numdict.put("sjugo", 20);
        numdict.put("trettio", 30);
        numdict.put("fyrtio", 40);
        numdict.put("femtio", 50);
        numdict.put("sextio", 60);
        numdict.put("sjuttio", 70);
        numdict.put("åttio", 80);
        numdict.put("nittio", 90);
        numdict.put("hundra", 100);
        numdict.put("tusen", 1000);
        numdict.put("miljon", 1000000);
        numdict.put("miljoner", 1000000);
        numdict.put("miljard", 1000000000);
        numdict.put("miljarder", 1000000000);
        
        while (sc.hasNext()) {
            word = sc.next();

            if (Objects.equals(word, "hundra")) {
                current *= numdict.get(word);
            }
            else if (Objects.equals(word, "tusen")
                    | Objects.equals(word, "miljon")
                    | Objects.equals(word, "miljoner")
                    | Objects.equals(word, "miljard")
                    | Objects.equals(word, "miljarder")) {
                current *= numdict.get(word);
                total += current;
                current = 0;
            } else {
                current += numdict.get(word);
            }
        }
        total += current;
        System.out.println(total);
    }
}
