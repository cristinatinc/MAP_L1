package Aufgabe1;
import java.util.Arrays;

public class GradeCalculator {
    public static int[] getInsufficientGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }




}
