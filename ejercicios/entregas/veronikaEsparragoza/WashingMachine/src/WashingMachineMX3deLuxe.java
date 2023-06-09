package src;

public class WashingMachineMX3deLuxe extends WashingMachineMX{
    public WashingMachineMX3deLuxe(){
        super();
        washingProgram = new WashingProgram[3];
        washingProgram[0] = new WashingProgram("Regular Length",5,65,80,true,false);
        washingProgram[1] = new WashingProgram("Special Length",10,65,80,true,false);
        washingProgram[2] = new WashingProgram("Special wool ",5,30,40,false,false);
        washingProgram[3] = new WashingProgram("Economic",3,45,45,true,false);

        SelectorTemperature selectorTemperature = new SelectorTemperature();
    }
}
