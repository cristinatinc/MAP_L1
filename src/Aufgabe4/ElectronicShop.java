package Aufgabe4;

import java.util.Arrays;

public class ElectronicShop {
    public static int getCheapestKeyboard(int[] keyboards){
        return Arrays.stream(keyboards).min().orElse(0);
    }

    public static int getMostExpensiveItem(int[] keyboards, int[] usb){
        int mostExpensiveKeyboard = Arrays.stream(keyboards).max().orElse(0);
        int mostExpensiveUSB = Arrays.stream(usb).max().orElse(0);

        return Math.max(mostExpensiveKeyboard, mostExpensiveUSB);
    }

    public static int getMostExpensiveUSBOnBudget(int[] usb, int budget){
        return Arrays.stream(usb).filter(price -> price <= budget).max().orElse(-1);

    }

    public static int getMaxSpendableAmount(int[] keyboards, int[] usb, int budget) {
        int maxSpent = -1;

        for (int keyboard : keyboards) {
            for (int usbPrice : usb) {
                int totalCost = keyboard + usbPrice;
                if (totalCost <= budget && totalCost > maxSpent) {
                    maxSpent = totalCost;
                }
            }
        }

        return maxSpent;
    }
}
