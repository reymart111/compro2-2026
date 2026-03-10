package com.aljohn;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;

public class Grade {

    static Scanner sc = new Scanner(System.in);

    static double compro2 = -1;
    static double dsa = -1;
    static double oop = -1;
    
    static final String FILE_NAME = "grades.json";

    public static void main(String[] args) {

        loadGrades();

        while (true) {
            System.out.println("\n===== MAIN MENU =====");
            System.out.println("[1] Enter Grades");
            System.out.println("[2] Display Grades");
            System.out.println("[3] Save Grades");
            System.out.println("[4] Exit");
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
                    saveGrades();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

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
                    break;

                case 2:
                    System.out.print("Enter DSA grade: ");
                    dsa = getDoubleInput();
                    break;

                case 3:
                    System.out.print("Enter OOP grade: ");
                    oop = getDoubleInput();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void displayGrades() {
        System.out.println("\n--- DISPLAY GRADES ---");

        System.out.println("COMPRO2: " + (compro2 == -1 ? "Not entered" : compro2));
        System.out.println("DSA: " + (dsa == -1 ? "Not entered" : dsa));
        System.out.println("OOP: " + (oop == -1 ? "Not entered" : oop));
    }

    // SAVE TO JSON
    private static void saveGrades() {
        try {
            FileWriter writer = new FileWriter(FILE_NAME);

            writer.write("{\n");
            writer.write("\"COMPRO2\": " + compro2 + ",\n");
            writer.write("\"DSA\": " + dsa + ",\n");
            writer.write("\"OOP\": " + oop + "\n");
            writer.write("}");

            writer.close();

            System.out.println("Grades saved to JSON!");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    // LOAD FROM JSON
    private static void loadGrades() {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            Scanner fileReader = new Scanner(file);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine().trim();

                if (line.contains("COMPRO2"))
                    compro2 = Double.parseDouble(line.split(":")[1].replace(",", "").trim());

                if (line.contains("DSA"))
                    dsa = Double.parseDouble(line.split(":")[1].replace(",", "").trim());

                if (line.contains("OOP"))
                    oop = Double.parseDouble(line.split(":")[1].replace(",", "").trim());
            }

            fileReader.close();

        } catch (Exception e) {
            System.out.println("Error loading JSON.");
        }
    }

    private static int getIntInput() {
        while (!sc.hasNextInt()) {
            System.out.print("Invalid input. Enter number: ");
            sc.next();
        }
        return sc.nextInt();
    }

    private static double getDoubleInput() {
        while (!sc.hasNextDouble()) {
            System.out.print("Invalid input. Enter number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}
