import java.util.*;


public class Code10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nameOfStudents = new String[10];
        int n;

        System.out.print("Enter the number of students : ");
        n = sc.nextInt();
        sc.nextLine(); 

        
        if (n <= 0 || n > 10) {
            System.out.println("Please enter a valid number of students (between 1 and 10).");
            
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            nameOfStudents[i] = sc.nextLine();
        }

       
        Arrays.sort(nameOfStudents, 0, n);

        
        System.out.println("Sorted names of students:");
        for (int i = 0; i < n; i++) {
            System.out.println(nameOfStudents[i]);
        }

        sc.close();
    }
}
