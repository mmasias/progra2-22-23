package com.progra.washingmachine.main;

public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1() {
        super();
        availablePrograms = new WashingProgram[3];

        availablePrograms[0] = new WashingProgram("Large Cycle", 5, 65, 80, true, false);

        availablePrograms[1] = new WashingProgram("Special Large Cycle", 5, 72, 85, true, true);

        availablePrograms[2] = new WashingProgram("Short Cycle", 3, 45, 60, true, false);

    }
}
