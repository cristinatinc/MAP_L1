package Aufgabe1;
import java.util.Arrays;

public class GradeCalculator {
    public static int[] getInsufficientGrades(int[] grades) {
        return Arrays.stream(grades).filter(grade -> grade < 40).toArray();
    }

    public static double getAverageGrade(int[] grades) {
        if (grades.length == 0) {
            return 0.00;
        }
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double average =  sum / grades.length;
        return Math.round(average * 100.00) / 100.00;
    }

    public static int[] getRoundedOffGrades(int[] grades) {
        int[] roundedOffGrades = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {
            if(grades[i] < 38) roundedOffGrades[i] = grades[i];
            else{
                int nextMultipleOfFive = ((grades[i] / 5) + 1) * 5;
                if (nextMultipleOfFive - grades[i] < 3) {
                    roundedOffGrades[i] = nextMultipleOfFive;
                } else {
                    roundedOffGrades[i] = grades[i];
                }
            }
        }
        return roundedOffGrades;
    }

    public static int maxRoundedGrade(int[] grades) {
        int[] roundedOffGrades = getRoundedOffGrades(grades);
        return Arrays.stream(roundedOffGrades).max().orElse(0);
    }




}
