package Aufgabe3;

public class BigNumber {
    public static int[] add(int[] nr1, int[] nr2) {
        int[] result = new int[nr1.length + 1];
        int carry = 0;

        for (int i = nr1.length - 1; i >= 0; i--) {
            int sum = nr1[i] + nr2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;

        return removeExtraZeros(result, nr1);

    }

    public static int[] subtract(int[] nr1, int[] nr2) {
        if (isLessThan(nr1, nr2)) {
            System.out.println("First number must be greater than or equal to the second number.");
            return null;
        }

        int[] result = new int[nr1.length];
        int borrow = 0;

        for (int i = nr1.length - 1; i >= 0; i--) {
            int difference = nr1[i] - nr2[i] - borrow;
            if (difference < 0) {
                difference += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = difference;
        }

        return removeExtraZeros(result, nr1);
    }

    public static int[] multiply(int[] nr, int digit) {
        int[] result = new int[nr.length + 1];
        int carry = 0;

        for (int i = nr.length - 1; i >= 0; i--) {
            int product = nr[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;

        return removeExtraZeros(result, nr);
    }

    public static int[] divide(int[] nr, int digit) {
        if (digit == 0) {
            System.out.println("Divide by zero.");
            return null;
        }

        int[] result = new int[nr.length];
        int carry = 0;

        for (int i = 0; i < nr.length; i++) {
            int current = carry * 10 + nr[i];
            result[i] = current / digit;
            carry = current % digit;
        }

        return removeExtraZeros(result, nr);
    }

    private static boolean isLessThan(int[] nr1, int[] nr2) {
        for (int i = 0; i < nr1.length; i++) {
            if (nr1[i] < nr2[i]) {
                return true;
            } else if (nr1[i] > nr2[i]) {
                return false;
            }
        }
        return false;
    }

    private static int[] removeExtraZeros(int[] result, int[] nr) {
        if (result[0] == 0) {
            int[] finalResult = new int[nr.length];
            System.arraycopy(result, 1, finalResult, 0, finalResult.length);
            return finalResult;
        }
        return result;
    }

}
