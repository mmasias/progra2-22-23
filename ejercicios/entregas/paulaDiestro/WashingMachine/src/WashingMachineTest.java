public class WashingMachineTest {
    public static void main (String[] args) {
        WashingMachineMX my_washingMachine;
        my_washingMachine = new WashingMachineMX1 ();
        System.out.println("WashingMachineMX1");
        manipulate (my_washingMachine);
        my_washingMachine = new WashingMachineMX2 ();
        System.out.println("WashingMachineMX2");
        manipulate (my_washingMachine);
        my_washingMachine = new WashingMachineMX3deLuxe ();
        System.out.println("WashingMachineMX3deLuxe");
        manipulate (my_washingMachine);
    }
    private static void manipulate (WashingMachineMX l) {
        l.programInf();
        l.programming();
        l.programInf();
        l.startProgram();
    }
}