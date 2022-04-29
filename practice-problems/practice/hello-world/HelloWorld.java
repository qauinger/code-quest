
// https://lmcodequestacademy.com/api/static/problems/hello-world
import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int inputLines = Integer.parseInt(scanner.nextLine());
      for (int line = 0; line < inputLines; line++) {
        System.out.println(scanner.nextLine());
      }
    }
  }
}
