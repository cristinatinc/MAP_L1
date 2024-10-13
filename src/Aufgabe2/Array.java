package Aufgabe2;

public class Array {
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int getMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maxSumWithoutAnElement(int[] array){
        int min = getMin(array);
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum - min;
    }

    public static int minSumWithoutAnElement(int[] array){
        int max = getMax(array);
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum - max;
    }
}
