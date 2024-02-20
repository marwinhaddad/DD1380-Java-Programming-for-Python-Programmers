import java.util.Scanner;

public class Kvadranter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String posStr = sc.nextLine();
        String stepsStr = sc.nextLine();

        String[] posStrArr = posStr.split("\\.");
        String[] stepsStrArr = stepsStr.split(" ");

        int[] pos = new int[posStrArr.length];

        for (int i = 0; i < posStrArr.length; i++) {
            pos[i] = Integer.parseInt(posStrArr[i]);
        }

        int R = Integer.parseInt(stepsStrArr[0]);
        int U = Integer.parseInt(stepsStrArr[1]);

        int N = pos.length - 1;

        // kolla om antalet steg är längre än rutnätet
        if (Math.abs(R) >= Math.pow(2, N+1) || Math.abs(U) >= Math.pow(2, N+1)) {
            System.out.println("outside");
            System.exit(0);
        }

        // referens
        int currentQuadrant = pos[0];

        // höger eller vänster
        if (R > 0) {
            for (int i = 0; i < R; i++) {
                pos = horizontal(N, pos, true);
            }
            if (currentQuadrant > pos[0]) {
                System.out.println("outside");
                System.exit(0);
            }
        } else {
            for (int i = 0; i < -R; i++) {
                pos = horizontal(N, pos, false);
            }
            if (currentQuadrant < pos[0]) {
                System.out.println("outside");
                System.exit(0);
            }
        }

        // ny referens
        currentQuadrant = pos[0];

        // upp eller ned
        if (U > 0) {
            for (int i = 0; i < U; i++) {
                pos = vertical(N, pos, true);
            }
            if (currentQuadrant > pos[0]) {
                System.out.println("outside");
                System.exit(0);
            }
        } else {
            for (int i = 0; i < -U; i++) {
                pos = vertical(N, pos, false);
            }
            if (currentQuadrant < pos[0]) {
                System.out.println("outside");
                System.exit(0);
            }
        }

        String finalPos = "";
        for (int i = 0; i <= N; i++) {
            finalPos += String.valueOf(pos[i]);
            if (i == N) {
                break;
            }
            finalPos += ".";
        }

        System.out.println(finalPos);

    }

    private static int[] horizontal(int N, int[] pos, boolean right) {
        int limit;
        int limitLower;
        int limitUpper;
        int step;

        if (right) {
            limitLower = 2;
            limitUpper = 4;
            step = 1;
        } else {
            limitLower = 1;
            limitUpper = 3;
            step = -1;
        }
        while (N > -1) {
            if (pos[N] == 1 || pos[N] == 2) {
                limit = limitLower;
            } else {
                limit = limitUpper;
            }

            pos[N] += step;

            if (pos[N] > limit) {
                pos[N] -= 2;
            } else if (pos[N] < limit) {
                pos[N] += 2;
            } else {
                break;
            }

            N -= 1;
        }
        return pos;
    }

    private static int[] vertical(int N, int[] pos, boolean up) {
        int limit;
        int limitLower;
        int limitUpper;
        int step;

        if (up) {
            limitLower = 3;
            limitUpper = 4;
            step = 2;
        } else {
            limitLower = 1;
            limitUpper = 2;
            step = -2;
        }
        while (N > -1) {
            if (pos[N] == 1 || pos[N] == 3) {
                limit = limitLower;
            } else {
                limit = limitUpper;
            }

            pos[N] += step;

            if (pos[N] > limit) {
                pos[N] -= 4;
            } else if (pos[N] < limit) {
                pos[N] += 4;
            } else {
                break;
            }

            N -= 1;
        }
        return pos;
    }
}
