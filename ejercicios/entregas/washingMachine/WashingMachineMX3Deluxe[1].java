package com.progra.washingmachine;

public class WashingMachineMX3Deluxe extends WashingMachineMX{
    public WashingMachineMX3Deluxe () {
        super(); //WashingMachineMX
        super.availablePrograms=new WashingProgram[5];
        availablePrograms[0]=new WashingProgram("Regular lenght",5, 65, 80, true, false );
        availablePrograms[1]=new WashingProgram("Economic",3, 45, 45, true, false );
        availablePrograms[2]=new WashingProgram("Short lenght",5, 45, 60, true, false );
        availablePrograms[3]=new WashingProgram("Wool special",3, 40, 60, false, false );
        availablePrograms[4]=new WashingProgram("Large special",5, 72, 85, true, true );
        selector = new TemperatureSelector();


    }
}
