package com.progra.washingmachine.main;

public class WashingMachineMX2 extends WashingMachineMX1 {
    public WashingMachineMX2() {
        super(); // WashingMachineMX1
        selector = new TemperatureSelector();
    }
}
