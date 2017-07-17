package com.theironyard;

import java.util.Scanner; // Receive inputs from the user
import java.lang.*; // For using the double operator

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner to get the user input

        System.out.println("Enter the first number"); // Enter the number
        String numberOne = scanner.nextLine(); // Wait for the user input

        System.out.println("Enter the second number"); // Enter the second number
        String numberTwo = scanner.nextLine(); // Wait for the user input

        Double operand1 = Double.parseDouble(numberOne);
        Double operand2 = Double.parseDouble(numberTwo);

        System.out.println("Input Numbers --------- " + operand1 + ", " + operand2); // Printing the numbers

        Double sum = operand1 + operand2;     // Using the basic math operators
        Double difference = operand1 - operand2;
        Double division = operand1 / operand2;
        Double multiplication = operand1 * operand2;
        Double reminder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, reminder); // Calling the function to display the result

        if(operand1.equals(operand2))  System.out.println("Testing equality operator : The numbers entered are same");
        else System.out.println("Testing equality operator : The numbers entered are different");


        String printResult = (operand1>operand2?"Testing Ternary operator: First > second": "Testing Ternary operator: Second > first");
        System.out.println(printResult);

    }
// void function to print the result

    private static void showResults(Double sum, Double difference, Double division, Double multiplication, Double reminder) {
        System.out.println("Sum ---" + sum);
        System.out.println("Difference ---" + difference);
        System.out.println("Multiplication ---" + multiplication);
        System.out.println("Division ---" + division);
        System.out.println("Reminder ---" + reminder);
    }
}



