package src;

public class WashingProgram {
    // Attributes
    private String name;
    private int numberOfSteps;
    private int times;
    private int waterConsumption;
    private boolean isSpin;
    private boolean preWash;

    // Constructor
    public WashingProgram(String name, int numberOfSteps, int times, int waterConsumption, boolean isSpin, boolean preWash) {
        this.name = name;
        this.numberOfSteps = numberOfSteps;
        this.times = times;
        this.waterConsumption = waterConsumption;
        this.isSpin = isSpin;
        this.preWash = preWash;
    }
    public void startWashingProgram() {
        if(preWash) {
            System.out.println("Pre-washing");
            for (int i = 0; i < numberOfSteps; i++) {
                System.out.println("Step: " + i);
                if (isSpin) {
                    System.out.println("Spinning");
                }
            }
            System.out.println("End of program " + name);
        }
    }
    public int waterConsumption() {
        return waterConsumption;
    }
    public String name() {
        return name;
    }
    public int duration(){
        return times;
    }

}
