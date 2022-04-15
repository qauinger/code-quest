// https://lmcodequestacademy.com/api/static/problems/animal-farm
import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.println((2 * sc.nextInt()) + (4 * (sc.nextInt() + sc.nextInt())));
        }
        sc.close();
    }
}