package com.progra.washingmachine;

public class WashingMachineMX3Deluxe extends WashingMachineMX{
    public WashingMachineMX3Deluxe () {
        super(); //WashingMachineMX
        selectorT=new TemperatureSelector();
        availablePrograms=new WashingProgram[5];
        availablePrograms[0]=new WashingProgram("Large length", 5,65,80,true,false);
        availablePrograms[1]=new WashingProgram("Short length",3,45,60,true,false);
        availablePrograms[2]=new WashingProgram("Economic",3,45,45,true,false);
        availablePrograms[3]=new WashingProgram ("Special wool",3,40,60,false,false);
        availablePrograms[4]=new WashingProgram("Special large",5,72,85,true,true);

    }
}