package javaactivity3;

import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            if (number > 0) {
                System.out.println(number + " is a positive number");
            } else if (number < 0) {
                System.out.println(number + " is a negative number");
            } else {
                System.out.println("Inputted number Zero");
            }
        }

        scanner.close();
    }
}

