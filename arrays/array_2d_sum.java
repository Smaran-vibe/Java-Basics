package arrays;


public class array_2d_sum {

        public static void main(String[] args) {

            // First matrix
            int[][] A = {
                    {4, 8, 12},
                    {5, 10, 15}
            };

            // Second matrix
            int[][] B = {
                    {7, 14, 21},
                    {8, 16, 24}
            };

            // Matrix to store the sum
            int[][] sum = new int[2][3];

            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 3; ++j) {

                    // Sum of [i][j] elements of A and B is
                    // Stored n the [i][j] position of sum
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }

            // Print the sum matrix
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < 3; ++j) {
                    System.out.println(sum[i][j]);
                }
            }
        }
    }

