import java.io.BufferedReader;
import java.io.InputStreamReader;

class WashingMachineMX {
    public WashingMachineMX () {
        _electricity_cons = 750;
        _av_program = null;
        _active_program = null;
        _selector = null;
    }
    public void startProgram () {
        if ( _active_program != null )
            _active_program.activate();
    }
    public void programming () {
        BufferedReader in = new BufferedReader ( new InputStreamReader(System.in) ); String line;
        int opcion=0;
        int temp=0;

        System.out.println("Washing Maxine MX"); System.out.println("Programming Mode"); System.out.println(); System.out.println("0 - Off");

        for (int i=0; i < _av_program.length; i++) System.out.println(i+1 + " - " + _av_program[i].getName());
        System.out.println();
        System.out.println("Selection: "); do {
            try {
                line = in.readLine();
                opcion = Integer.parseInt (line);
            }
            catch (Exception e) {
                System.err.println(e);
            }

        } while ( (option < 0) || (option > _av_program.length) );
        if (option == 0) _av_program = null;
        else _active_program = _av_program[opcion-1];

        if (_selector != null) {
            do {
                try {
                    System.out.print("Temperature: "); line = in.readLine();
                    temp = Integer.parseInt (line);
                }
                catch (Exception e) {
                    System.err.println(e);
                }
            } while ( (temp < 0) || (temp > _selector.maxTemperature()) );
            _selector.setTemperature(temp); }
    }

    public void programInf () {
        double cons;
        if (_active_program == null)
            System.err.println("There is not program");
        else {
            System.out.print("Program: " + _active_program.getName() + " , ");
            System.out.print("Temperature: ");
            if (_selector != null)
                System.out.print(_selector.temperature());
            else System.out.print("0");
            System.out.println();
            System.out.print("Duration: " + _active_program.getDuration() + " , ");
            System.out.print("Water consumption: " + _active_program.getWaterConsumption() + " ,");

            cons = _electricity_cons * (_active_program.getDuration() / 60.0);
            if (_selector != null)
                cons += _selector.ElectricityConsumption();
            System.out.println("Electric consumption: " + cons + "w.");
        }
    }

    private int _electricity_cons;
    protected WashingProgram[] _av_program;
    private WashingProgram _active_program;
    protected TemperatureSelector _selector;
}