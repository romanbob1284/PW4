package task5;

import task5.percentage.Percentage;
import task5.percentage.impl.BankPercentageImpl;

/**
 * Головний клас.
 */
public class Main {
    /**
     * Головний метод.
     */
    public static void main() {
        Percentage example = new BankPercentageImpl(100, 7);
        example.printCalculatedBill(1);

        example.setDeposit();
        example.setPercentage();
        example.printCalculatedBill();
    }
}