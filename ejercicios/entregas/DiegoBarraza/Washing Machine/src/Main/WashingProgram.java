package Main;

public class WashingProgram {


    public WashingProgram(String name, int nPhases, int time,
                          int waterCons, boolean spin, boolean prewash) {
        this.name= name;
        this.nPhases = nPhases;
        this.duration = time;
        this.waterConsumption = waterCons;
        this.spin = spin;
        this.prewashed = prewash;
    }
    public void activate () {
        if ( this.prewashed ) System.out.println("Prewashed");

        for (int i=1; i<=this.nPhases; i++)
            System.out.println("nPhases " + i);

        if ( this.spin ) System.out.println("Spin");

        System.out.println("End of program" + this.name);
    }

    public int getWaterConsumption () {
        return ( waterConsumption );
    }

    public String getName () {
        return ( name );
    }

    public int getDuration () {
        return ( duration);
    }

    public boolean Spin() {
        return spin;
    }

    public boolean Prewash() {
        return prewashed;
    }

    public int getNPhases() {
        return nPhases;
    }

    private String name;
    private int nPhases;
    private int duration;
    private int waterConsumption;
    private boolean spin;
    private boolean prewashed;
}
