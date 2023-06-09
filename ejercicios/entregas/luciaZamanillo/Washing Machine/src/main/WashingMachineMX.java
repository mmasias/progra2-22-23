package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WashingMachineMX {
    private int electricalCons;
    protected WashingProgram[] availablePrograms;
    private WashingProgram activeProgram;
    protected TemperatureSelector selector;

    public WashingMachineMX() {
        electricalCons = 750;
        availablePrograms = null;
        activeProgram = null;
        selector = null;
    }

    public void start() {
        if (activeProgram != null) {
            activeProgram.activate();
        }
    }

    public void program() {
        // Declarations
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int option = 0;
        int temp = 0;

        // Display menu
        System.out.println("Washing Machines MX");
        System.out.println("Programming Mode");
        System.out.println();

        System.out.println("0 - Off");
        for (int i = 0; i < availablePrograms.length; i++) {
            System.out.println(i+1 + " - " + availablePrograms[i].getName());
        }
        System.out.println();

        // Reading selection
        System.out.println("Selection: ");
        do {
            try {
                line = in.readLine();
                option = Integer.parseInt(line);
            }
            catch (Exception e ) {
                System.err.println(e);
            }
        } while (option < 0 || option > availablePrograms.length);

        // Assign active program
        if (option == 0) {
            activeProgram = null;
        }
        else {
            activeProgram = availablePrograms[option - 1];
        }

        // Select temperature
        if (selector != null) {
            do {
                try {
                    System.out.println("Temperature: ");
                    line = in.readLine();
                    temp = Integer.parseInt(line);
                }
                catch (Exception e) {
                    System.err.println(e);
                }
            } while (temp < 0 || temp > selector.getMaxTemperature());
            selector.fixTemperature(temp);
        }
    }

    public void programInfo() {
        double cons;

        if (activeProgram == null) {
            System.err.println("There's no program");
        }
        else {
            System.out.print("Program: " + activeProgram.getName() + ", ");
            System.out.print("Temperature: ");
            if (selector != null) {
                System.out.print(selector.getTemperature());
            }
            else {
                System.out.print("0");
            }
            System.out.println();
            System.out.print("Duration: " + activeProgram.getDuration() + ", ");
            System.out.print("Water Consumption: " + activeProgram.getWaterConsumption() + ", ");

            cons = electricalCons * (activeProgram.getDuration() / 60.0);
            if (selector != null) {
                cons += selector.electricalConsumption();
            }
            System.out.println("Electrical Consumption: " + cons + " W.");
        }
    }
}
