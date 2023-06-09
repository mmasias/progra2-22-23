package Test;

import Main.WashingMachineMX;
import Main.WashingMachineMX1;
import Main.WashingMachineMX2;
import Main.WashingMachineMX3;

public class WashingMachineTest {
    public static void main (String[] args) {
        WashingMachineMX myWashingMachine;
        myWashingMachine = new WashingMachineMX1();
        System.out.println("WashingMachineMX1");
        manipulate (myWashingMachine);
        myWashingMachine = new WashingMachineMX2();
        System.out.println("WashingMachineMX2");
        manipulate (myWashingMachine);
        myWashingMachine = new WashingMachineMX3();
        System.out.println("WashingMachineMX3");
        manipulate (myWashingMachine);
    }
    private static void manipulate (WashingMachineMX l) {
        l.ProgramInf();
        l.program();
        l.ProgramInf();
        l.start();
    }
}
