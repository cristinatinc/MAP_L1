import java.util.Arrays;

import static Aufgabe1.GradeCalculator.*;
import static Aufgabe2.Array.*;
import static Aufgabe3.BigNumber.*;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        System.out.println("Aufgabe 1: ");

        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.println("Die nicht ausreichende Noten aus [29, 37, 38, 41, 84, 67] sind: " + Arrays.toString(insufficientGrades));

        double averageGrade = getAverageGrade(grades);
        System.out.println("Die Mittelnote ist " + averageGrade);

        int[] roundedOffGrades = getRoundedOffGrades(grades);
        System.out.println("Die abgerundeten Noten sind: " + Arrays.toString(roundedOffGrades));

        int maxGrade = maxRoundedGrade(grades);
        System.out.println("Maximale abgerundete Note ist " + maxGrade);


        // Aufgabe 2
        System.out.println();
        System.out.println("Aufgabe 2: ");
        int[] array = {4, 8, 3, 10, 17};

        int max = getMax(array);
        int min = getMin(array);

        System.out.println("Maximum vom Array [4, 8, 3, 10, 17] ist " + max);
        System.out.println("Minimum vom Array [4, 8, 3, 10, 17] ist " + min);

        int maxSum = maxSumWithoutAnElement(array);
        System.out.println("Maximum sum vom Array [4, 8, 3, 10, 17] ist " + maxSum);

        int minSum = minSumWithoutAnElement(array);
        System.out.println("Minimum sum vom Array [4, 8, 3, 10, 17] ist " + minSum);


        // Aufgabe 3
        System.out.println();
        System.out.println("Aufgabe 3: ");

        int[] nr1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] nr2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] nr3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] nr4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] nr5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};

        int[] sum = add(nr1, nr2);
        System.out.println("[1 3 0 0 0 0 0 0 0] + [8 7 0 0 0 0 0 0 0] = " + Arrays.toString(sum));
        int[] diff = subtract(nr3, nr4);
        System.out.println("[8 3 0 0 0 0 0 0 0] - [5 4 0 0 0 0 0 0 0] = " + Arrays.toString(diff));
        int[] product = multiply(nr5, 2);
        System.out.println("[2 3 6 0 0 0 0 0 0] * 2 = " + Arrays.toString(product) );

    }
}