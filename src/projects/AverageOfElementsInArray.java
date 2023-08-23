package projects;

public class AverageOfElementsInArray {
    public static void main(String[] args) {

        int[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int j : list) sum += j;
        double average = sum / list.length;
        System.out.println(average);
    }
}
