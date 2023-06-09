package Main;

import Main.TemperatureSelector;
import Main.WashingMachineMX;

public class WashingMachineMX3 extends WashingMachineMX {
    public WashingMachineMX3 () {
        super();
        availablePr= new WashingProgram[5];
        availablePr[0] = new WashingProgram
                ("Normal Large", 5, 65, 80, true, false);
        availablePr[1] = new WashingProgram
                ("SpecialLarge ", 5, 72, 85, true, true);
        availablePr[2] = new WashingProgram
                ("Normal Short ", 3, 45, 60, true, false);
        availablePr[3] = new WashingProgram
                ("Special Wool", 3, 40, 60, false, false);
        availablePr[4] = new WashingProgram
                ("Economic", 3, 45, 45, true, false);
        selector = new TemperatureSelector();
    }
}
