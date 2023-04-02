import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        double distance = 0;
        do {
            System.out.println("Menu based app - Unit conversion for Distance");
            System.out.println("1. CM to M");
            System.out.println("2. M to KM");
            System.out.println("3. KM to M");
            System.out.println("4. M to CM");
            System.out.print("Enter your menu - ");
            choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Please enter the CM Value: ");
                    distance = scanner.nextDouble() / 100;
                    System.out.printf("%.2f CM = %.2f M\n", distance * 100, distance);
                    break;
                case "2":
                    System.out.print("Please enter the M Value: ");
                    distance = scanner.nextDouble() / 1000;
                    System.out.printf("%.2f M = %.2f KM\n", distance * 1000, distance);
                    break;
                case "3":
                    System.out.print("Please enter the KM Value: ");
                    distance = scanner.nextDouble() * 1000;
                    System.out.printf("%.2f KM = %.2f M\n", distance, distance / 1000);
                    break;
                case "4":
                    System.out.print("Please enter the M Value: ");
                    distance = scanner.nextDouble() * 100;
                    System.out.printf("%.2f M = %.2f CM\n", distance, distance / 100);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
            scanner.nextLine();
            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("y"));
        scanner.close();
    }
}
