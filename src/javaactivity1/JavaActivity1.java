package javaActivity1;

import java.util.Scanner;

public class JavaActivity1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int arts, science, history, math, social;
        String name;

        System.out.print("Enter name: ");
        name = in.nextLine();

        System.out.print("Enter marks in Science: ");
        science = in.nextInt(); 
        System.out.print("Enter marks in History: ");
        history = in.nextInt();
        System.out.print("Enter marks in Math: ");
        math = in.nextInt(); 
        System.out.print("Enter marks in Social: ");
        social = in.nextInt();
        System.out.print("Enter marks in Arts: ");
        arts = in.nextInt(); 

        int totalMarks = science + history + math + social + arts;
        double percentage = (totalMarks / 5.0);

        String remarks = "";
        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage < 76) {
            remarks = "Poor";
        } else if (percentage < 81) {
            remarks = "Fair";
        } else if (percentage < 86) {
            remarks = "Good";
        } else if (percentage < 91) {
            remarks = "Very Good";
        } else {
            remarks = "Excellent";
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total percentage: " + percentage);
        System.out.println("Remarks: " + remarks);

        if (percentage < 70) {
            System.out.println("Try Again");
        } else {
            System.out.println("Congrats " + name + " you Passed.");
        }

        in.close();
    }
}

