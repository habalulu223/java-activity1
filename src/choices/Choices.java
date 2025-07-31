package javaactivity1;

import java.util.Scanner;
import banking.bankingClass;

public class Choices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_ATTEMPTS = 3;
        int attempts = 0;
        boolean loggedIn = false;
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        System.out.print("Enter choice: ");
        
        int choice = sc.nextInt();
        
        switch(choice) {
            case 1:
                bankingClass bc = new bankingClass();
                
                while (attempts < MAX_ATTEMPTS && !loggedIn) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();
                    
                    if (bc.verifyAccount(accountNo, pin)) {
                        loggedIn = true;
                        System.out.println("Account verified successfully!");
                      
                    } else {
                        attempts++;
                        if (attempts < MAX_ATTEMPTS) {
                            System.out.println("INVALID ACCOUNT! Attempts remaining: " + (MAX_ATTEMPTS - attempts));
                        } else {
                            System.out.println("Maximum login attempts reached. Exiting...");
                            System.exit(0);
                        }
                    }
                }
                
                
                System.out.println("Banking operations menu would appear here...");
                break;
                
            case 2:
                System.out.println("Doctors appointment system would appear here...");
                break;
                
            case 3:
                System.out.println("Shopping system would appear here...");
                break;
                
            default:
                System.out.println("Invalid Selection!");
        }
        
        sc.close();
    }
}
