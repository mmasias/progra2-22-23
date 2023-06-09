package com.progra.washingmachine;

public class WashingMachineMX2  extends WashingMachineMX1 {
    public WashingMachineMX2 () {
        super(); //WashingMachineMX1
        selector = new TemperatureSelector ();
    }
}
