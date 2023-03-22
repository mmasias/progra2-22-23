package com.progra.washingmachine;

public class WashingMachineMX {
    public WashingMachineMX() {
        this.electricalConsumption = 750;
        this.availablePrograms = null;
        this.activeProgram = null;
        this.selector = null;
    }
    public void start(){
        if (this.activeProgram != null)
            this.activeProgram.activate();
    }
    public void setProgram(){

    }

    public void infoProgram(){
        System.out.println(activeProgram.getName());
    }

    private int electricalConsumption;
    protected WashingProgram[] availablePrograms;
    private WashingProgram activeProgram;
    protected TemperatureSelector selector;
}
