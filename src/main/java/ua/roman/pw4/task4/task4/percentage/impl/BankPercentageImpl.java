package task4.percentage.impl;

import java.util.Locale;

import task5.percentage.Percentage;

/**
 * Зберігає параметри депозиту користувача банка.
 */
public class BankPercentageImpl implements Percentage {

    private float deposit;
    private float percentage;

    /**
     * Усталений конструктор.
     */
    public BankPercentageImpl() {
    }

    /**
     * Параметризований конструктор.
     */
    public BankPercentageImpl(float deposit, float percentage) {
        this.deposit = deposit;
        this.percentage = percentage;
    }

    /**
     * Реалізує безпечне введення даних.
     */
    private float input(String inputText) {
        while (true) {
            try {
                IO.print(inputText);
                return Float.parseFloat(IO.readln().trim());
            } catch (NumberFormatException e) {
                IO.println("Помилка ! Введіть ціле число.");
            } catch (java.io.IOError e) {
                IO.println("Виникла помилка " + e.getMessage() + ".");
            }
        }
    }

    @Override
    public void setDeposit() {
        String inputText = "Введіть суму вкладу: ";
        this.deposit = input(inputText);
    }

    @Override
    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    @Override
    public float getDeposit() {
        return this.deposit;
    }

    @Override
    public void setPercentage() {
        String inputText = "Введіть відсоток нарахування: ";
        this.percentage = input(inputText);
    }

    @Override
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    @Override
    public float getPercentage() {
        return this.percentage;
    }

    @Override
    public float calculateBill() {
        String inputText = "Введіть термін вкладу у місяцях: ";
        return calculateBill((int)(input(inputText)));
    }

    @Override
    public float calculateBill(int months) {
        float calculatedBill = this.deposit;
        for (int i = 0; i < months; i++) {
            calculatedBill += (this.percentage / 100 * calculatedBill);
        }
        return calculatedBill;
    }

    @Override
    public void printCalculatedBill() {
        IO.println("Сума вкладу буде становити: " + String.format(Locale.US, "%.2f", calculateBill()));
    }

    @Override
    public void printCalculatedBill(int years) {
        IO.println("Сума вкладу буде становити: " + String.format(Locale.US, "%.2f", calculateBill(years)));
    }
}