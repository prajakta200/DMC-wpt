//Write a program to input n numbers on command line argument and calculate maximum of them.

import java.util.*;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        
        if (n <= 0) {
            System.out.println("The number  must be greater than 0.");
            
        }

        
        int maxNumber = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = sc.nextInt();

            if (num > maxNumber) {
                maxNumber = num;
            }
        }

        
        System.out.println("The maximum number is: " + maxNumber);

        sc.close();
    }
   
}
