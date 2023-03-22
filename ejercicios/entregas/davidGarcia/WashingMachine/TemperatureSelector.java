package com.progra.washingmachine;

public class TemperatureSelector {
    public TemperatureSelector () { _temperature = 0; }
    public void setTemperature (int temp) {
        if ( (temp >= 0) && (temp <= _maxTemperature) )
            _temperature = temp;
        else System.err.println("Error: Temperatura incorrecta");
    }
    public int temperature () {
        return ( _temperature );
    }
    public int maxTemperature () {
        return ( _maxTemperature );
    }
    public int electricalConsumption () {
        return ( _temperature * 30 / 100 );
    }
    private int                 _temperature;
    private final int   _maxTemperature = 90;
}
