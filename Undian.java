import java.util.*;

public class Undian {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int x = input.nextInt();

        int[] kupon = new int[n];
        for (int i = 0; i < n; i++) {
            kupon[i] = input.nextInt();
        }
        Arrays.sort(kupon);

        int smallestDiff = Integer.MAX_VALUE;
        List<Integer> winners = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(kupon[i] - x);
            if (diff < smallestDiff) {
                smallestDiff = diff;
                winners.clear();
                winners.add(kupon[i]);
            } else if (diff == smallestDiff) {
                winners.add(kupon[i]);
            } else {
                break;
            }
        }

        Collections.sort(winners);
        for (int winner : winners) {
            System.out.println(winner);
        }
        input.close();
    }
}