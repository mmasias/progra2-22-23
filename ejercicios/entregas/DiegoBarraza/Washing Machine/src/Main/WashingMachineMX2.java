package Main;

import Main.TemperatureSelector;
import Main.WashingMachineMX1;

public class WashingMachineMX2 extends WashingMachineMX1 {
    public WashingMachineMX2 () {
        super();
        selector = new TemperatureSelector();
    }
}
