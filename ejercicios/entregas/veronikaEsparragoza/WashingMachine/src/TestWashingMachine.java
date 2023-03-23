package src;
public class TestWashingMachine {
    private static void printMenu(WashingMachineMX washingMachine){
        washingMachine.infoProgram();
        washingMachine.program();
        washingMachine.infoProgram();
        washingMachine.startWashingProgram();
    }
    public static void main (String[] args){
        WashingMachineMX1 myWashingMachine = new WashingMachineMX1();
        System.out.println("Washing machine MX1");
        printMenu(myWashingMachine);

        WashingMachineMX2 myWashingMachineMX2 = new WashingMachineMX2();
        System.out.println("Washing machine MX2");
        printMenu(myWashingMachineMX2);

        WashingMachineMX3deLuxe myWashingMachineMX3 = new WashingMachineMX3deLuxe();
        System.out.println("Washing machine MX3");
        printMenu(myWashingMachineMX3);
    }

}
