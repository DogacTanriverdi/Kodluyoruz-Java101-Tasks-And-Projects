package tasks;

public class FindingTheMatrixTranspose {
    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("Matrix: ");
        printArray(matrix);
        System.out.println("Transpose: ");
        transpose(matrix);
    }

    static void transpose(int[][] matrix) {
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                newMatrix[col][row] = matrix[row][col];
            }
        }
        printArray(newMatrix);
    }

    private static void printArray(int[][] matrix) {
        for (int[] row : matrix) {
            for (int col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }
}
