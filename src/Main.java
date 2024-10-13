import java.util.Arrays;

import static Aufgabe1.GradeCalculator.*;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.println("Die nicht ausreichende Noten aus [29, 37, 38, 41, 84, 67] sind: " + Arrays.toString(insufficientGrades));

        double averageGrade = getAverageGrade(grades);
        System.out.println("Die Mittelnote ist " + averageGrade);

        int[] roundedOffGrades = getRoundedOffGrades(grades);
        System.out.println("Die abgerundeten Noten sind: " + Arrays.toString(roundedOffGrades));

        int maxGrade = maxRoundedGrade(grades);
        System.out.println("Maximale abgerundete Note ist " + maxGrade);

    }
}