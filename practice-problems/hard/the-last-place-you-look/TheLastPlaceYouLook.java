// https://lmcodequestacademy.com/api/static/problems/the-last-place-you-look
import java.util.HashMap;
import java.util.Scanner;

public class TheLastPlaceYouLook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputLines = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < inputLines; i++) {
            HashMap<String, Integer> coords = new HashMap<String, Integer>();
            for(int j = 0; j < 3; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                int d = sc.nextInt();
                for(int k = 0; k <= 2 * d; k++) {
                    int ix = x - d + k;
                    String a = ix + "," + (k < d ? y + k : y + 2 * d - k);
                    String b = ix + "," + (k < d ? y - k : y - 2 * d + k);
                    coords.put(a, (coords.containsKey(a) ? coords.get(a) : 0) + 1);
                    if(!a.equals(b))
                        coords.put(b, (coords.containsKey(b) ? coords.get(b) : 0) + 1);
                }
            }
            for(String l : coords.keySet()) {
                if(coords.get(l) == 3) {
                    System.out.println("(" + l + ")");
                }
            }
        }
        sc.close();
    }
}
