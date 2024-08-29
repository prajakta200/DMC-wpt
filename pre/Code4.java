/*Write a program to calculate the grade of a student. There are five subjects. Marks in each subject are entered from keyboard. Assign grade 
based on the following rule:
Total Marks >= 90 Grade: Ex
90 > Total Marks >= 80 Grade: A
80 > Total Marks >= 70 Grade: B
70 > Total Marks >= 60 Grade: C
60 > Total Marks Grade: F
*/

import java.util.Scanner;

public class Code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int[] marks = new int[5];
        int totalMarks = 0;

        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        
        double averageMarks = totalMarks / 5.0;

        
        char grade;
        if (averageMarks >= 90) {
            grade = 'E'; // Ex for Excellent
        } else if (averageMarks >= 80) {
            grade = 'A';
        } else if (averageMarks >= 70) {
            grade = 'B';
        } else if (averageMarks >= 60) {
            grade = 'C';
        } else {
            grade = 'F'; // F for Fail
        }

        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}

