import java.util.Scanner;

public class Act3 {

    static Scanner sc = new Scanner(System.in);

    // Grade storage
    static double compro2 = -1;
    static double dsa = -1;
    static double oop = -1;

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("[1] Enter Grades");
            System.out.println("[2] Display Grades");
            System.out.println("[3] Exit");
            System.out.print("Choose option: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    enterGradesMenu();
                    break;
                case 2:
                    displayGrades();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Sub-menu for entering grades
    private static void enterGradesMenu() {
        while (true) {
            System.out.println("\n--- ENTER GRADES MENU ---");
            System.out.println("[1] COMPRO2");
            System.out.println("[2] DSA");
            System.out.println("[3] OOP");
            System.out.println("[0] Go Back");
            System.out.print("Choose subject: ");

            int choice = getIntInput();

            switch (choice) {
                case 1:
                    System.out.print("Enter COMPRO2 grade: ");
                    compro2 = getDoubleInput();
                    System.out.println("Grade saved!");
                    break;

                case 2:
                    System.out.print("Enter DSA grade: ");
                    dsa = getDoubleInput();
                    System.out.println("Grade saved!");
                    break;

                case 3:
                    System.out.print("Enter OOP grade: ");
                    oop = getDoubleInput();
                    System.out.println("Grade saved!");
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Display grades
    private static void displayGrades() {
        System.out.println("\n--- DISPLAY GRADES ---");

        System.out.println("COMPRO2: " + (compro2 == -1 ? "Not entered" : compro2));
        System.out.println("DSA: " + (dsa == -1 ? "Not entered" : dsa));
        System.out.println("OOP: " + (oop == -1 ? "Not entered" : oop));
    }

    // Safe integer input
    private static int getIntInput() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    // Safe double input
    private static double getDoubleInput() {
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Enter a number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
