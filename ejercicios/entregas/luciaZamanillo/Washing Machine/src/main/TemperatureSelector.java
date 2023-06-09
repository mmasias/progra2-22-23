package main;

public class TemperatureSelector {
    private int temperature;
    private final int maxTemperature = 90;

    public TemperatureSelector() {
        temperature = 0;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public int electricalConsumption() {
        return temperature * 30 / 100;
    }

    public void fixTemperature (int temp) {
        if (temp >= 0 && temp <= maxTemperature) {
            temperature = temp;
        }
        else {
            System.err.println("Error: Incorrect Temperature");
        }
    }
}
