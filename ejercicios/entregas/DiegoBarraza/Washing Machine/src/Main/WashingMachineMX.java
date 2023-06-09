package Main;

import Main.TemperatureSelector;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WashingMachineMX {
    public WashingMachineMX () {
        electricityCons = 750;
        availablePr = null;
        activePr = null;
        selector = null;
    }
    public void start () {
        if ( activePr != null )
            activePr.activate();
    }
    public void program () {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int option = 0;
        int temp = 0;

        System.out.println("Washing Maxine MX");
        System.out.println("Programming Mode");
        System.out.println();
        System.out.println("0 - Off");

        for (int i = 0; i < availablePr.length; i++) System.out.println(i + 1 + " - " + availablePr[i].getName());
        System.out.println();
        System.out.println("Selection: ");
        do {
            try {
                line = in.readLine();
                option = Integer.parseInt(line);
            } catch (Exception e) {
                System.err.println(e);
            }

        } while ((option < 0) || (option > availablePr.length));
        if (option == 0) availablePr = null;
        else activePr = availablePr[option - 1];

        if (selector != null) {
            do {
                try {
                    System.out.print("Temperature: ");
                    line = in.readLine();
                    temp = Integer.parseInt(line);
                } catch (Exception e) {
                    System.err.println(e);
                }
            } while ((temp < 0) || (temp > selector.maxTemperature()));
            selector.setTemperature(temp);
        }
    }
    public void ProgramInf () {
        double cons;
        if (activePr == null)
            System.err.println("There is not program");
        else {
            System.out.print("Program: " + activePr.getName() + " , ");
            System.out.print("Temperature: ");
            if (selector != null)
                System.out.print(selector.temperature());
            else System.out.print("0");
            System.out.println();
            System.out.print("Duration: " + activePr.getDuration() + " , ");
            System.out.print("Water consumption: " + activePr.getWaterConsumption() + " ,");

            cons = electricityCons * (activePr.getDuration() / 60.0);
            if (selector != null)
                cons += selector.ElectricityConsump();
            System.out.println("Electric consumption: " + cons + "w.");
        }
    }
    private int electricityCons;
    protected WashingProgram[] availablePr;
    private WashingProgram activePr;
    protected TemperatureSelector selector;
}
