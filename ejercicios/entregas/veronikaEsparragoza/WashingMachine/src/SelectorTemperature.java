package src;

public class SelectorTemperature {
    // Attributes
    private int temperature;
    private final int maxTemperature = 90;
    public SelectorTemperature() {
        temperature = 0;
    }
    public void setTemperature(int temperature) {
        if(temperature >= 0 && temperature <= maxTemperature) {
            this.temperature = temperature;
        } else {
            System.out.println("Error: Temperature not valid");
        }
    }
    public int temperature() {
        return temperature;
    }
    public int getMaxTemperature() {
        return maxTemperature;
    }
    public int electricalConsumption(){
        return (temperature * 30/100);
    }
}
