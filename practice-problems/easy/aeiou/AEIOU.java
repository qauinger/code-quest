// https://lmcodequestacademy.com/api/static/problems/aeiou
import java.util.Scanner;

public class AEIOU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < inputLines; i++) {
            int vowels = 0;
            for(char c : scanner.nextLine().toCharArray()) {
                c = Character.toLowerCase(c);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                }
            }
            System.out.println(vowels);
        }
        scanner.close();
    }
}
