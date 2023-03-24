package test;

import main.WashingMachineM3deLuxe;
import main.WashingMachineMX;
import main.WashingMachineMX1;
import main.WashingMachineMX2;

public class WashingMachineTest {
    private static void manipulate (WashingMachineMX machine) {
        machine.programInfo();
        machine.program();
        machine.programInfo();
        machine.start();
    }
    public static void main (String[] args) {
        WashingMachineMX myWashingMachine;

        myWashingMachine = new WashingMachineMX1();
        System.out.println("Washing Machine MX1");
        manipulate(myWashingMachine);

        myWashingMachine = new WashingMachineMX2();
        System.out.println("Washing Machine MX2");
        manipulate(myWashingMachine);

        myWashingMachine = new WashingMachineM3deLuxe();
        System.out.println("Washing Machine MX3deLuxe");
        manipulate(myWashingMachine);

    }


}
