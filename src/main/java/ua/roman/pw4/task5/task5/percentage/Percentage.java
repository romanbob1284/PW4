package task5.percentage;

/**
 * Зберігає параметри депозиту.
 */
public interface Percentage {

    /**
     * Реалізує користувацьке визначення суми вкладу.
     */
    void setDeposit();

    /**
     * Визначає суму вкладу за аргументом.
     */
    void setDeposit(float deposit);

    /**
     * Повертає суму вкладу.
     */
    float getDeposit();

    /**
     * Реалізує користувацьке визначення відсотка нарахувань.
     */
    void setPercentage();

    /**
     * Визначає відсоток нарахувань за аргументом.
     */
    void setPercentage(float percentage);

    /**
     * Повертає відсоток нарахувань.
     */
    float getPercentage();

    /**
     * Розраховує суму вкладу
     * при користувацькому введенні терміна розрахунку.
     */
    float calculateBill();

    /**
     * Розраховує суму вкладу
     * при отриманні терміна розрахунку за аргументом.
     */
    float calculateBill(int months);

    /**
     * Виводить розраховану суму вкладу
     * при користувацькому введенні терміна розрахунку.
     */
    void printCalculatedBill();

    /**
     * Виводить розраховану суму вкладу
     * при отриманні терміна розрахунку за аргументом.
     */
    void printCalculatedBill(int months);
}