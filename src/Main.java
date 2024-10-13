import java.util.Arrays;

import static Aufgabe1.GradeCalculator.getInsufficientGrades;

public class Main {
    public static void main(String[] args) {
        // Aufgabe 1
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] insufficientGrades = getInsufficientGrades(grades);
        System.out.println("Die nicht ausreichende Noten aus [29, 37, 38, 41, 84, 67] sind: " + Arrays.toString(insufficientGrades));
    }
}