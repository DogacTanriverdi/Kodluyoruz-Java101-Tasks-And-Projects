package projects;

public class PrintingLetterAWithMultidimensionalArrays {
    public static void main(String[] args) {

        String[][] letterA = new String[6][4];

        for (int i = 0; i < letterA.length; i++) {
            for (int j = 0; j < letterA[i].length; j++) {
                if (i == 0 || i == 2 || i == 5) {
                    letterA[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letterA[i][j] = " * ";
                } else {
                    letterA[i][j] = "   ";
                }
            }
        }
        for (String[] row : letterA) {
            for (String col : row)
                System.out.print(col);
            System.out.println();
        }


    }
}
