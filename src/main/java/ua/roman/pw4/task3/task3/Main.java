package task3;

import task3.population.Population;
import task3.population.impl.CountryPopulationImpl;

/**
 * Головний клас.
 */
public class Main {
    /**
     * Головний метод.
     */
    public static void main() {
        Population XYZ = new CountryPopulationImpl(10000000, 14, 8);
        XYZ.printCalculatedPopulation(10);

        XYZ.setPopulation();
        XYZ.setNatality();
        XYZ.setMortality();
        XYZ.printCalculatedPopulation();
    }
}