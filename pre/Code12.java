//Write a Program to reverse the letters present in the given String. Do not use strrev() function.


import java.util.*;

public class Code12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String inputString = sc.nextLine();

        char[] charArray = inputString.toCharArray();


        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        String reversedString = new String(charArray);

        System.out.println("Reversed string: " + reversedString);

        sc.close();
    }
}

