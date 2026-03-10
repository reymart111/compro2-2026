package com.aljohn;

public class Main {
    public static void main(String[] args) {
       loadGrades();
       while (true) {
        System.out.println("\n===== MAIN MENU=====");
        System.out.println("[1] ENTER GRADES");
        System.out.println("[2] displayGrades ");
        System.out.println("[3] SAVE GRADES ");        
        System.out.println("[4] EXIT ");
        System.out.print("CHOOSE OPTION");

        int choice = getIntInput();
        switch (choice) {
            case 1:
                enterGradesMenu();
                break;
        switch (choice) {
            case 2:
                displayGrades();
                break;
        
        switch (choice) {
            case 3:
                saveGrades();
                break;


            case 4: System.out.println("Exiting Program....");
            
        
        
           }
          }
         } 
       }
    }
}