package Main;

import Main.WashingMachineMX;

public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1 () {
        super();
        availablePr= new WashingProgram[3];
        availablePr[0] = new WashingProgram
                ("Normal Long", 5, 65, 80, true, false);
        availablePr[1] = new WashingProgram
                ("Special Large", 5, 72, 85, true, true);
        availablePr[2] = new WashingProgram
                ("Normal Short", 3, 45, 60, true, false);
    }
}
