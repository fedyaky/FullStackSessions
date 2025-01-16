package Session5;

public class MatrixExample {
    public static void main(String[] args) {
        int [][] matrix = {
                {2,5,4},
                {9,3,5},
                {3,7,5}
        };


        int sum = 0;
        for (int [] row : matrix) {
            for (int i : row) {
                sum += i;
            }
        }
        System.out.println("Sum of all integers in the matrix: " + sum);



        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }




//        for (int[] row : matrix) {
//            for (int element : row) {
//                System.out.print(element + " ");
//            }
            System.out.println();
        }
        printWithForEach(matrix);
    }
    public static void printWithForEach(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        printCalculateSsumForEachColumn(matrix);
    }

    private static void printCalculateSsumForEachColumn(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix.length; j++) {
                sum += matrix[j][i];
            }
            System.out.println("Sum of column " + i + ": " + sum);
        }

        int[][] transposed = transposeMatrix(matrix);
    }
    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transposed = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("Transposed matrix:");
        for (int[] row : transposed) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
            return transposed;

   }
}


