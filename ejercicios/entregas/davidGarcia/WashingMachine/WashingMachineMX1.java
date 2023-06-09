package com.progra.washingmachine;

public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1(){
        super.availablePrograms=new WashingMachineProgram[3];
        availablesPrograms[0]=new WashingProgram("RegularLength",5,65,80,true,false);
        availablesPrograms[1]=new WashingProgram("RegularShort",3,45,60,true,false);
        availablesPrograms[2]=new WashingProgram("Economic",3,45,45,true,false);

    }
}
