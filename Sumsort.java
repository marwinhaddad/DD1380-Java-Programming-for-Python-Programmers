import java.util.*;

public class Sumsort {
private int summera_tal(int n, List<Integer> sekvens){
    int i;
    if (n % 2 == 0){
        i = n/2;
    }
    else{
        i =(n+1)/2;
    }
    int sum = 0;
    for (int j = 0; j < i; j++){
        sum = sum + sekvens.get(j);
    }
    return sum;
    }
  
    public static void main(String[] args){
        Summera def = new Summera();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> sekvens = new <Integer>ArrayList();
        while (sc.hasNextInt()){
            sekvens.add(sc.nextInt());

        }
        Collections.sort(sekvens, Collections.reverseOrder());
        int total_summa = def.summera_tal(n, sekvens);
        System.out.println(total_summa);
    }  
}
