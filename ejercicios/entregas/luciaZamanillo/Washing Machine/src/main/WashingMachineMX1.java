package main;

public class WashingMachineMX1 extends  WashingMachineMX {
    public WashingMachineMX1() {
        super();
        availablePrograms = new WashingProgram[3];
        availablePrograms[0] = new WashingProgram
                ("Normal Long", 5, 65, 80, true, false);
        availablePrograms[1] = new WashingProgram
                ("Special Long", 5, 72, 85, true, true);
        availablePrograms[2] = new WashingProgram
                ("Normal Short", 3, 45, 60, true, false);

    }
}
