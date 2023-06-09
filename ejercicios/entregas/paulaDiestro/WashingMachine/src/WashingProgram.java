public class WashingProgram {

    public WashingProgram(String name, int numPhases, int duration, int waterConsumption, boolean spin, boolean prewash) {
        this.name = name;
        this.numPhases = numPhases;
        this.duration = duration;
        this.waterConsumption = waterConsumption;
        this.spin = spin;
        this.prewash = prewash;
    }

    public void activate(){
        if ( this.prewash ) System.out.println("Prewash");

        for (int i=1; i<=this.numPhases; i++)
            System.out.println("Phase " + i);

        if ( this.spin ) System.out.println("Spin");

        System.out.println("End of program" + this.name);
    }

    public String getName() {
        return name;
    }

    public int getNumPhases() {
        return numPhases;
    }

    public int getDuration() {
        return duration;
    }

    public int getWaterConsumption() {
        return waterConsumption;
    }

    public boolean isSpin() {
        return spin;
    }

    public boolean isPrewash() {
        return prewash;
    }

    private String  name;
    private int numPhases;
    private int duration;
    private int waterConsumption;
    private boolean spin;
    private boolean prewash;

}