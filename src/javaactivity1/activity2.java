package javaactivity2;
import java.util.Scanner;
public class activity2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        
        System.out.print("Enter a number: ");
        number1 = sc.nextInt();
        if (number1 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number1 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }

        
        System.out.print("Enter a number: ");
        int number2 = sc.nextInt();
        if (number2 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number2 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
        
        System.out.print("Enter a number: ");
        int number3 = sc.nextInt();
        if (number3 == 0) {
            System.out.println("Inputted number Zero");
        } else if (number3 % 2 == 0) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }
}
}