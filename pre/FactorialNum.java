//Write a program to calculate a Factorial of a number.


import java.util.Scanner;

public class FactorialNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            
        }

        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        
        System.out.println("The factorial of " + number + " is: " + factorial);

        sc.close();
    }
}

