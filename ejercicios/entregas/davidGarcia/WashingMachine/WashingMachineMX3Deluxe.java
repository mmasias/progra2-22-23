package com.progra.washingmachine;

public class WashingMachineMX3Deluxe extends WashingMachineMX{
    public WashingMachineMX3Deluxe () {
        super(); //WashingMachineMX
        availablesPrograms[0]=new WashingProgram("RegularLength",5,65,80,true,false);
        availablesPrograms[1]=new WashingProgram("RegularShort",3,45,60,true,false);
        availablesPrograms[2]=new WashingProgram("Economic",3,45,45,true,false);
        availablesPrograms[3]=new WashingProgram("SpecialLength",5,72,85,true,true);
        availablesPrograms[4]=new WashingProgram("SpecialWool",3,40,60,false,false);
        selector = new TemperatureSelector ();
    }
}
