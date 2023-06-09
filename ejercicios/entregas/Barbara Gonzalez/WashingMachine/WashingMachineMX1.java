public class WashingMachineMX1 extends WashingMachineMX{
    public WashingMachineMX1(){
        super(); //WashingMachineMX

        WashingProgram[] availablePrograms = new WashingProgram[3];
        availablePrograms[0] = new WashingProgram ("Largo Normal", 5, 65, 80, true, false);
        availablePrograms[1] = new WashingProgram ("Largo Especial", 5, 72, 85, true, true);
        availablePrograms[2] = new WashingProgram ("Corto Normal", 3, 45, 60, true, false);


    }
}
