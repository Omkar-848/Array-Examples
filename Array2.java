package Array;

import java.util.Scanner;  // ✅ You forgot to import Scanner

public class Array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        // Declare and initialize the array
        int[] numbers = new int[size];

        // Input elements from user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        // Output elements
        System.out.println("You entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": " + numbers[i]);
        }

        sc.close();
    }
}


	


