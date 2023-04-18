package main;

public class WashingMachineMX2 extends WashingMachineMX1 {
    public WashingMachineMX2 () {
        super();
        selector = new TemperatureSelector();
    }
}
