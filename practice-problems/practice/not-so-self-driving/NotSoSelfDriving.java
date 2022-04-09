import java.util.Scanner;

public class NotSoSelfDriving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLines = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < inputLines; i++) {
            String line = scanner.next();
            String[] split = line.split(":", 2);
            double speed = Double.parseDouble(split[0]);
            double distance = Double.parseDouble(split[1]);
            if(speed >= distance) {
                System.out.println("SWERVE");
            } else if((5 * speed) >= distance) {
                System.out.println("BRAKE");
            } else {
                System.out.println("SAFE");
            }
        }
        scanner.close();
    }
}
