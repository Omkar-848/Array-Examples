package Array;

public class Array3 {
    public static void main(String[] args) {
        int[][] a = {
            {10, 20, 30},
            {50, 60, 10},
            {70, 80, 90}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // move to next line after inner loop
        }
    }
}

