package com.progra.washingmachine.main;

import java.io.*;

public class WashingMachineMX {

    private int electricalConsumption;
    protected WashingProgram[] availablePrograms;
    private WashingProgram activeProgram;
    protected TemperatureSelector selector;

    public WashingMachineMX() {
        electricalConsumption = 750;
        availablePrograms = null;
        activeProgram = null;
        selector = null;
    }

    public void start() {
        if (activeProgram != null) {
            System.out.println("Starting program...");
            activeProgram.activate();
        }
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

        for (int i = 0; i < availablePrograms.length; i++) {
            System.out.println((i + 1) + " - " + availablePrograms[i].getName());
        } // Print available programs list
        System.out.println();

        System.out.print("Select program: ");
        do {
            try {
                line = in.readLine();
                option = Integer.parseInt(line);
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (option < 0 && option > availablePrograms.length);

        if (option == 0) {
            activeProgram = null;
            infoProgram();
        } else {
            activeProgram = availablePrograms[option - 1];
        }

        if (selector != null) { // si existe selector
            do {
                try {
                    System.out.print("Select temperature: ");
                    line = in.readLine();
                    temp = Integer.parseInt(line);
                } catch (Exception e) {
                    System.out.println(e);
                }
                selector.setTemperature(temp);
                break;
            } while (temp > 0 && temp < selector.maxTemperature());
        }
    }

    public void infoProgram() {
        double consumption;

        System.out.println();

        if (activeProgram == null) {
            System.out.println("No program selected");
            System.out.println("----------------------------------");
            setProgram();
        } else {
            System.out.println("Program: " + activeProgram.getName());
            System.out.print("Temperature: ");
            if (selector != null) {
                System.out.print(selector.temperature());
                System.out.print("°C");
            } else {
                System.out.print("0");
            }
            System.out.println();
            System.out.println("Duration: " + activeProgram.getDuration());
            System.out.println("Water consumption: " +
                    activeProgram.getWaterConsumption());
            System.out.println();
        }

        consumption = electricalConsumption * (activeProgram.getDuration()
                / 60.0);

        if (selector != null) {
            consumption += selector.electricalConsumption();
            System.out.println("Electrical consumption: " + consumption + "w.");
        }
    }

}
