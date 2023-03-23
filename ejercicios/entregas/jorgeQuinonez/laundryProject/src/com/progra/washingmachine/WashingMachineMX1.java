package com.progra.washingmachine;

public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1() {
        super();
        WashingProgram[] programs = new WashingProgram[3];

        programs[0] = new WashingProgram("Large Cicle", 5, 65, 80, true, false);

        programs[1] = new WashingProgram("Special Large Cicle", 5, 72, 85, true, true);

        programs[2] = new WashingProgram("Short Cicle", 3, 45, 60, true, false);

    }
}
