// https://lmcodequestacademy.com/api/static/problems/anagram-checker
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.List;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < inputLines; i++) {
            String line = scanner.nextLine();
            String[] words = line.split("\\|", 2);
            if(!words[0].equals(words[1])) {
                List<Character> letters = words[0].chars().mapToObj(c -> (char) c).collect(Collectors.toList());
                for(char c : words[1].toCharArray()) {
                    if(letters.indexOf(c) == -1)
                        break;
                    letters.remove(letters.indexOf(c));
                }
                if(letters.size() == 0) {
                    System.out.println(line + " = ANAGRAM");
                    continue;
                }
            }
            System.out.println(line + " = NOT AN ANAGRAM");
        }
        scanner.close();
    }
}
