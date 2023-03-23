package src;

public class WashingMachineMX1 extends WashingMachineMX{
    public WashingMachineMX1() {
        super();

        washingProgram = new WashingProgram[3];
        washingProgram[0] = new WashingProgram("Regular Length",5,65,80,true,false);
        washingProgram[1] = new WashingProgram("Long Length",10,65,80,true,false);
        washingProgram[2] = new WashingProgram("Delicate",5,30,40,false,false);
    }
}
