package com.progra.washingmachine;

import java.io.*;

public class WashingMachineMX {

    public WashingMachineMX() {
        this.electricalConsumption = 750;
        this.availablePrograms = null;
        this.activeProgram = null;
        this.selector = null;
    }

    public void start() {
        if (this.activeProgram != null)
            this.activeProgram.activate();
    }

    public void setProgram() {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int option = 0;
        int temp = 0;

        System.out.println("Lavadoras MX");
        System.out.println("Programming mode");
        System.out.println();
        System.out.println("0 - Off");

        // Print available programs list
        for (int i = 0; i < availablePrograms.length; i++) {
            System.out.println((i + 1) + " - " + availablePrograms[i].getName());
        }
        System.out.println();

        System.out.println("Select program: ");
        do {
            try {
                line = in.readLine();
                option = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (option < 0 || option > availablePrograms.length);

        if (option == 0) {
            activeProgram = null;
        } else {
            activeProgram = availablePrograms[option - 1];
        }

        if (selector != null) {
            do {
                try {
                    System.out.println("Select temperature: ");
                    line = in.readLine();
                    temp = Integer.parseInt(line);
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (temp < 0 || temp > selector.maxTemperature());
        }
        selector.setTemperature(temp);
    }

    public void infoProgram() {
        double cons;

        if (activeProgram == null) {
            System.out.println("No program selected");
        } else {
            System.out.println("Program: " + activeProgram.getName());
            System.out.println("Temperature: " + selector.temperature());
            if (selector != null) {
                System.out.println(selector.temperature());
            } else {
                System.out.println("0");
            }
            System.out.println();
            System.out.println("Duration: " + activeProgram.getDuration());
            System.out.println("Water consumption: " + activeProgram.getWaterConsumption());
        }

        cons = electricalConsumption * (activeProgram.getDuration() / 60.0);

        if (selector != null) {
            cons += selector.electricalConsumption();
            System.out.println("Electrical consumption: " + cons + "w.");
        }
    }

    private int electricalConsumption;
    private WashingProgram[] availablePrograms;
    private WashingProgram activeProgram;
    protected TemperatureSelector selector;
}
