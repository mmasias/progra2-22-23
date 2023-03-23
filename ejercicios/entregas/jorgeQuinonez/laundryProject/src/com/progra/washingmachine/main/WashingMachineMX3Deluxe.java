package com.progra.washingmachine.main;

public class WashingMachineMX3Deluxe extends WashingMachineMX {
    public WashingMachineMX3Deluxe() {
        super(); // WashingMachineMX
        selector = new TemperatureSelector();
        WashingProgram[] programs = new WashingProgram[5];

        programs[0] = new WashingProgram("Large Cicle", 5, 65, 80, true, false);

        programs[1] = new WashingProgram("Special Large Cicle", 5, 72, 85, true, true);

        programs[2] = new WashingProgram("Short Cicle", 3, 45, 60, true, false);

        programs[3] = new WashingProgram("Special Wool Cicle", 3, 40, 60, false, false);

        programs[4] = new WashingProgram("Economic Cicle", 3, 45, 45, true, false);
    }
}
