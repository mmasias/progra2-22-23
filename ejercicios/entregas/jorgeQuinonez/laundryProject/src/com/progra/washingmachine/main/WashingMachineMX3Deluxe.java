package com.progra.washingmachine.main;

public class WashingMachineMX3Deluxe extends WashingMachineMX {
    public WashingMachineMX3Deluxe() {
        super(); // WashingMachineMX
        selector = new TemperatureSelector();
        availablePrograms = new WashingProgram[5];

        availablePrograms[0] = new WashingProgram("Large Cicle", 5, 65, 80, true, false);

        availablePrograms[1] = new WashingProgram("Special Large Cicle", 5, 72, 85, true, true);

        availablePrograms[2] = new WashingProgram("Short Cicle", 3, 45, 60, true, false);

        availablePrograms[3] = new WashingProgram("Special Wool Cicle", 3, 40, 60, false, false);

        availablePrograms[4] = new WashingProgram("Economic Cicle", 3, 45, 45, true, false);
    }
}
