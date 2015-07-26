package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("What type of calculation would you like to perform? (+, -, *, /)");
        Scanner reader = new Scanner(System.in);
        String operation = reader.next();

        while (!operation.equals("+") & !operation.equals("-") & !operation.equals("*") & !operation.equals("/")) {
            System.out.println("Please enter a valid operator: ");
            operation = reader.next();
        }

        System.out.println("Enter the first number:");
        String firstNumberInput = reader.next();
        while (!isNumeric(firstNumberInput)) {
            System.out.println("Please enter a valid number");
            firstNumberInput = reader.next();
        }
        double firstNumber = Double.parseDouble(firstNumberInput);

        System.out.println("Enter the second number:");
        String secondNumberInput = reader.next();
        while (!isNumeric(secondNumberInput)) {
            System.out.println("Please enter a valid number");
            secondNumberInput = reader.next();
        }
        double secondNumber = Double.parseDouble(secondNumberInput);
        double result = calculate(operation, firstNumber, secondNumber);

        System.out.println("The result is " + result);
    }

    public static double calculate(String operation, double firstNumber, double secondNumber) {
        double result = 0;
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
        }
        return result;
    }

    public static boolean isNumeric(String input) {
        return input.matches("-?\\d+(\\.\\d+)?");
    }
}
