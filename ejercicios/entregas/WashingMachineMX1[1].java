package com.progra.washingmachine;

public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1(){
        super.availablePrograms=new WashingProgram[3];
        super.availablePrograms=new WashingProgram[3];
        availablePrograms[0]=new WashingProgram("Regular lenght",5, 65, 80, true, false );
        availablePrograms[1]=new WashingProgram("Economic",3, 45, 45, true, false );
        availablePrograms[2]=new WashingProgram("Short lenght",5, 45, 60, true, false );
    }
}
