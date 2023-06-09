import org.junit.Test;

public class TestWashingMachine {
    private static WashingMachineMX l;

    @Test
    public static void main(String[] args) {
        WashingMachineMX my_WashingMachine;

        my_WashingMachine = new WashingMachineMX();
        System.out.println("LavadoraMX1");
        manipular (my_WashingMachine);

        my_WashingMachine = new WashingMachineMX2 ();
        System.out.println("LavadoraMX2");
        manipular (my_WashingMachine);

        my_WashingMachine = new WashingMachineMX3Deluxe ();
        System.out.println("LavadoraMX3deLuxe");
        manipular (my_WashingMachine);
    }

    @Test
    private static void manipular(WashingMachineMX my_washingMachine) {
        l.infoProgram();
        l.setProgram();
        l.infoProgram();
        l.start();

    }

}
