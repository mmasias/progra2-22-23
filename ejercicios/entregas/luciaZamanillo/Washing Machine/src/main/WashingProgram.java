package main;

public class WashingProgram {
    private String name;
    private int numberPhases;
    private int duration;
    private int waterConsumption;
    private boolean spin;
    private boolean prewash;

    public WashingProgram (String name, int numberPhases, int duration, int waterConsumption, boolean spin, boolean prewash) {
        this.name = name;
        this.numberPhases = numberPhases;
        this.duration = duration;
        this.waterConsumption = waterConsumption;
        this.spin = spin;
        this.prewash = prewash;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void activate() {
        if (prewash) {
            System.out.println("Prewash");
        }
        for (int i = 1; i <= numberPhases; i++) {
            System.out.println("Phase " + i);
        }
        if (spin) {
            System.out.println("Spin");
        }
        System.out.println("End of program " + name);
    }

}
