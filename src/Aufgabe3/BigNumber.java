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

        if (result[0] == 0) {
            int[] finalResult = new int[nr1.length];
            for (int i = 0; i < nr1.length; i++) {
                finalResult[i] = result[i + 1];
            }
            return finalResult;
        } else {
            return result;
        }
    }
}
