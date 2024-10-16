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

        return removeExtraZeros(result);
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
        return removeExtraZeros(result);
    }

    public static int[] multiply(int[] nr, int digit) {
        if (digit == 0) {
            return new int[]{0};
        }
        int[] result = new int[nr.length + 1];
        int carry = 0;

        for (int i = nr.length - 1; i >= 0; i--) {
            int product = nr[i] * digit + carry;
            result[i + 1] = product % 10;
            carry = product / 10;
        }

        result[0] = carry;

        return removeExtraZeros(result);
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
        return removeExtraZeros(result);
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

    private static int[] removeExtraZeros(int[] result) {
        int firstNonZeroIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                firstNonZeroIndex = i;
                break;
            }
        }
        if (firstNonZeroIndex == result.length) return new int[]{0};

        int[] finalResult = new int[result.length - firstNonZeroIndex];
        System.arraycopy(result, firstNonZeroIndex, finalResult, 0, finalResult.length);

        return finalResult;
    }
}
