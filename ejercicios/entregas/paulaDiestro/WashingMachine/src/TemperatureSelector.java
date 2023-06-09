public class TemperatureSelector {

    public void setTemperature (int temp) {
        if ( (temp >= 0) && (temp <= _maxTemperature) )
            _temperature = temp;
        else System.err.println("Error: Wrong temperature");
    }
    public int temperature () {
        return ( _temperature );
    }
    public int maxTemperature () {
        return ( _maxTemperature );
    }
    public int ElectricityConsumption () {
        return ( _temperature * 30 / 100 );
    }
    private int _temperature;
    private final int _maxTemperature = 90;
}

