import java.util.Scanner;

public class Addiply {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int n1, n2;
        for (int i = 0; i < times; i++) {
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println((n1 + n2) + " " + (n1 * n2));
        }
        sc.close();
    }
}