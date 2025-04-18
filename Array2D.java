package Array;

public class Array2D {
	
	
	    public static void main(String[] args) {
	        // Declare and initialize a 2D array (3x3 array)
	        int[][] array = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        // Loop through the 2D array to print its values
	        for (int i = 0; i < array.length; i++) {         // Iterate through rows
	            for (int j = 0; j < array[i].length; j++) {  // Iterate through columns
	                System.out.print(array[i][j] + " ");
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }
	}



