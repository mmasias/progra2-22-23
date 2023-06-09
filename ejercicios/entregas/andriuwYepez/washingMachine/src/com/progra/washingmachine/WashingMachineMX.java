package com.progra.washingmachine;

public class WashingMachineMX {

    private int electricalConsumption;
    protected WashingProgram[] availablePrograms;
    private WashingProgram activePrograme;
    protected TemperatureSelector selectorT;

    public WashingMachineMX() {
        this.electricalConsumption = 750;
        this.availablePrograms = null;
        this.activePrograme = null;
        this.selectorT = null;
    }
    public void start(){
        if (this.activePrograme != null)
            this.activePrograme.activate();
    }
    public void setProgram(){

    }

    public void infoProgram(){
        System.out.print(activePrograme.getName());
    }

}