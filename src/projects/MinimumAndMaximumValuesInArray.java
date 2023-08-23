package projects;

public class MinimumAndMaximumValuesInArray {
    public static void main(String[] args) {

        int[] list = {52, 53, 24, 74, 24, -13, -64, 6, 1, 4};
        // min = list[0], min < list[i] ? min = list[i] : ''
        // max = list[0], max > list[i] ? max = list[i] : ''
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) min = i;
            if (i > max) max = i;
        }

        System.out.println("Minimum value: " + min + "\nMaximum value: " + max);
    }
}
