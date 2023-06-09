package Main;

public class TemperatureSelector {
    public TemperatureSelector () {
        temperature = 0;
    }
    public void setTemperature (int temp) {
        if ( (temp >= 0) && (temp <= maxTemperature) )
            temperature = temp;
        else System.err.println("Error: Wrong Temp");
    }
    public int temperature () {
        return ( temperature );
    }
    public int maxTemperature () {
        return ( maxTemperature );
    }
    public int ElectricityConsump () {
        return ( temperature * 30 / 100 );
    }
    private int temperature;
    private final int maxTemperature = 90;
}
