package src;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WashingMachineMX {
    // Attributes
    private int electricalConsumption;
    protected WashingProgram[] washingProgram;
    private WashingProgram selectedProgram;
    protected SelectorTemperature selectorTemperature;

    public WashingMachineMX() {
        this.electricalConsumption = 750;
        this.washingProgram = new WashingProgram[5];
        this.selectedProgram = null;
        this.selectorTemperature = null;
    }
    public void startWashingProgram() {
        if (selectedProgram != null) {
            selectedProgram.startWashingProgram();
        } else {
            System.out.println("Error: No program selected");
        }
    }
    public void program(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int option = 0;
        int temperature = 0;

        System.out.println("Washing Machine MX");
        System.out.println("Programming mode");
        System.out.println();
        System.out.println("0. Exit");
        for (int i = 0; i < washingProgram.length; i++) {
            System.out.println((i + 1) + " - " + washingProgram[i].name());
        }
        System.out.println();

        System.out.println("Select a program: ");
        do {
            try {
                line = in.readLine();
                option = Integer.parseInt(line);
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (option < 0 || option > washingProgram.length);

        if(option == 0) {
            selectedProgram = null;
        } else {selectedProgram = washingProgram[option - 1];}

        if(selectedProgram != null) {
            System.out.println("Select temperature: ");
            do {
                try {
                    line = in.readLine();
                    temperature = Integer.parseInt(line);
                } catch (Exception e) {
                    System.err.println(e);
                }
            } while (temperature < 0 || temperature > selectorTemperature.getMaxTemperature());
            selectorTemperature.setTemperature(temperature);
        }
    };

    public void infoProgram(){
        double consumption;

        if (selectedProgram == null){
            System.out.println("No program selected");
        } else {
            System.out.println("Program: " + selectedProgram.name() + " , ");
            System.out.println("Temperature: " + selectorTemperature.temperature() + " , ");
            if (selectedProgram != null)
                System.out.println(selectorTemperature.temperature());
            else{
                System.out.println("0");
            }
            System.out.println();
            System.out.println("Duration: " + selectedProgram.duration() + " , ");
            System.out.println("Water consumption: " + selectedProgram.waterConsumption() + " , ");

            consumption = electricalConsumption * (selectedProgram.duration() / 60.0);
            if(selectedProgram != null) {
                consumption += selectorTemperature.electricalConsumption();
            }
            System.out.println("Electrical consumption: " + consumption + "W.");
        }
    }
}
