import java.util.Scanner;

public class Boff {
private int antalboffs(int n, int a, int b){
    int boff = 0;

    for (int i = a; i <= b; i++){
        
        if (String.valueOf(i).endsWith(String.valueOf(n))){
            boff++; 
        }
        else if (i % n == 0){
            boff++;
        }    
    }
    return boff;
            }

    public static void main(String[] args) {
        boff_main count = new boff_main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int totalboff = count.antalboffs(n, a, b);
        System.out.println(totalboff);
    }  
}
