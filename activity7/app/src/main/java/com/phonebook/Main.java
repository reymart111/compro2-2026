package com.phonebook;

import com.phonebook.models.Contact;
import com.phonebook.services.PhonebookService;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       
        PhonebookService service = new PhonebookService;
        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n=====PHONEBOOK MENU=====");
            System.out.println("1.add");
            System.out.println("2.Search");
            System.out.println("3.Remove");
            System.out.println("4.Display All");
            System.out.println("5.Save to CSV");
            System.out.println("0.Exit");
            System.out.print("Choose Option");


            
        }



    }
}