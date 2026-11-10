package task3.population.impl;

import task3.population.Population;

/**
 * Зберігає демографічні показники країни для подальшої обробки.
 */
public class CountryPopulationImpl implements Population {

    private int population;
    private int natality;
    private int mortality;

    /**
     * Усталений конструктор.
     */
    public CountryPopulationImpl() {
    }

    /**
     * Параметризований конструктор.
     */
    public CountryPopulationImpl(int population, int natality, int mortality) {
        this.population = population;
        this.natality = natality;
        this.mortality = mortality;
    }

    /**
     * Реалізує безпечне введення даних.
     */
    private int input(String inputText) {
        while (true) {
            try {
                IO.print(inputText);
                return Integer.parseInt(IO.readln().trim());
            } catch (NumberFormatException e) {
                IO.println("Помилка ! Введіть ціле число.");
            } catch (java.io.IOError e) {
                IO.println("Виникла помилка " + e.getMessage() + ".");
            }
        }
    }

    @Override
    public void setPopulation() {
        String inputText = "Введіть населення країни: ";
        this.population = input(inputText);
    }

    @Override
    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public int getPopulation() {
        return this.population;
    }

    @Override
    public void setNatality() {
        String inputText = "Введіть народжуваність країни на 1000 осіб: ";
        this.natality = input(inputText);
    }

    @Override
    public void setNatality(int natality) {
        this.natality = natality;
    }

    @Override
    public int getNatality() {
        return this.natality;
    }

    @Override
    public void setMortality() {
        String inputText = "Введіть смертність країни на 1000 осіб: ";
        this.mortality = input(inputText);
    }

    @Override
    public void setMortality(int mortality) {
        this.mortality = mortality;
    }

    @Override
    public int getMortality() {
        return this.mortality;
    }

    @Override
    public int calculatePopulation() {
        String inputText = "Введіть термін розрахунку населення країни: ";
        return calculatePopulation(input(inputText));
    }

    @Override
    public int calculatePopulation(int years) {
        return (int) (this.population + (this.population / 1000. * years * (this.natality - this.mortality)));
    }

    @Override
    public void printCalculatedPopulation() {
        IO.println("Розраховане населення країни: " + calculatePopulation() + " осіб.");
    }

    @Override
    public void printCalculatedPopulation(int years) {
        IO.println("Розраховане населення країни: " + calculatePopulation(years) + " осіб.");
    }
}