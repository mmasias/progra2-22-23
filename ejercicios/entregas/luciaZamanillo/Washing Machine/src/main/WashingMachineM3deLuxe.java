package main;

public class WashingMachineM3deLuxe extends WashingMachineMX {
    public WashingMachineM3deLuxe() {
        super();
        availablePrograms = new WashingProgram[5];
        availablePrograms[0] = new WashingProgram
                ("Normal Long", 5, 65, 80, true, false);
        availablePrograms[1] = new WashingProgram
                ("Special Long", 5, 72, 85, true, true);
        availablePrograms[2] = new WashingProgram
                ("Normal Short", 3, 45, 60, true, false);
        availablePrograms[3] = new WashingProgram
                ("Special Wool", 3, 40, 60, false, false);
        availablePrograms[4] = new WashingProgram
                ("Economic", 3, 45, 45, true, false);

        selector = new TemperatureSelector();
    }
}
