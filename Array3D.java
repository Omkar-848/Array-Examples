package Array;

public class Array3D {
	
	
	    public static void main(String[] args) {
	        // Declare and initialize a 3D array (2x2x2 array)
	        int[][][] array = {
	            {
	                {1, 2}, 
	                {3, 4}
	            },
	            {
	                {5, 6}, 
	                {7, 8}
	            }
	        };

	        // Access and print specific elements
	        System.out.println(array[0][0][0]); // Output: 1
	        System.out.println(array[1][1][1]); // Output: 8
	    }
	}



