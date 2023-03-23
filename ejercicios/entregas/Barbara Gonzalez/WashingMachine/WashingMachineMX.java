import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WashingMachineMX {

    private int electricalConsumption;
    private WashingProgram[] availablePrograms;
    private WashingProgram activeProgram;
    private TemperatureSelector selector;

    public WashingMachineMX() {
        this.electricalConsumption = 750;
        this.availablePrograms = null;
        this.activeProgram = null;
        this.selector = null;
    }

    public void start(){
        if (this.activeProgram != null)
            this.activeProgram.activate();
    }

    public void setProgram(){
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        String line;
        int option = 0;
        int temp = 0;

        System.out.println("Lavadora MX");
        System.out.println("Modo Programacion");
        System.out.println();
        System.out.println("0 - Apagado");
        for (int i =0; i < availablePrograms.length; i++){
            System.out.println(i+1 + " - " + availablePrograms[i].getName());
            System.out.println();

            System.out.println("Seleccion:");
            do {
                try {
                    line = in.readLine();
                    option = Integer.parseInt(line);
                }
                catch (Exception e){
                    System.err.println(e);
                }
            }while ((option < 0) || (option > availablePrograms.length));
            if (option == 0) availablePrograms = null;
            else activeProgram = availablePrograms[option -1];
            if (selector != null){
                do {
                    try {
                        System.out.println("Temperatura: ");
                        line = in.readLine();
                        temp = Integer.parseInt(line);
                    }
                    catch (Exception e){
                        System.err.println(e);
                    }
                }while ((temp < 0) || (temp > selector.maxTemperature()));
                selector.setTemperature(temp);
            }
        }
    }

    public void infoProgram(){
        double cons;

        if (activeProgram == null)
            System.out.println("No hay programa");
        else {
            System.out.print("Programa: " + activeProgram.getName() + " , ");
            System.out.print("Temperatura: ");
            if (selector!= null)
                System.out.print(selector.temperature());
            else System.out.print("0");
            System.out.println();
            System.out.print("Duración: " + activeProgram.getDuration() + " , ");
            System.out.print("Consumo agua: " + activeProgram.getWaterConsumption() + " , ");
                    cons =electricalConsumption * (activeProgram.getDuration()/60.0);
            if (selector != null)
                cons += selector.electricalConsumption();
            System.out.println("Consumo electrico: " + cons + "w.");
        }

    }




}
