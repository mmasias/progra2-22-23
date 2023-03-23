import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LavadoraMX {
    private int _cons_electr;
    protected ProgramaLavado[] _pr_disponibles;
    private ProgramaLavado _pr_activo;
    protected SelectorTemperatura _selector;
    public LavadoraMX () {
        _cons_electr = 750;
        _pr_disponibles = null;
        _pr_activo = null;
        _selector = null;
    }
    public void ponerEnMarcha () {
        if ( _pr_activo != null )
            _pr_activo.activar();
    }
    public void programar () {
        BufferedReader in = new BufferedReader( new InputStreamReader(System.in) );
        String linea;
        int opcion=0;
        int temp=0;
        System.out.println("Lavadoras MX");
        System.out.println("Modo Programacion");
        System.out.println();
        System.out.println("0 - Apagado");
        for (int i=0; i < _pr_disponibles.length; i++)
            System.out.println(i+1 + " - " + _pr_disponibles[i].nombre());
        System.out.println();
        System.out.println("Seleccion: ");
        do {
            try {
                linea = in.readLine();
                opcion = Integer.parseInt (linea);
            }
            catch (Exception e) {
                System.err.println(e);
            }
        } while ( (opcion < 0) || (opcion > _pr_disponibles.length) );
        if (opcion == 0) _pr_activo = null;
        else _pr_activo = _pr_disponibles[opcion-1];

        if (_selector != null) {
            do {
                try {
                    System.out.print("Temperatura: ");
                    linea = in.readLine();
                    temp = Integer.parseInt (linea);
                }
                catch (Exception e) {
                    System.err.println(e);
                }
            } while ( (temp < 0) || (temp > _selector.tempMaxima()) );
            _selector.fijarTemperatura(temp);
        }

    }
    public void infoPrograma () {
        double cons;
        if (_pr_activo == null)
            System.err.println("No hay programa");
        else {
            System.out.print("Programa: " + _pr_activo.nombre() + " , ");
            System.out.print("Temperatura: ");
            if (_selector != null)
                System.out.print(_selector.temperatura());
            else System.out.print("0");
            System.out.println();
            System.out.print("Duración: " + _pr_activo.duracion() + " , ");
            System.out.print("Consumo agua: " + _pr_activo.consumoAgua() + " , ");
            cons = _cons_electr * (_pr_activo.duracion()/60.0);
            if (_selector != null)
                cons += _selector.consumoElectr();
            System.out.println("Consumo electrico: " + cons + "w.");
        }
    }

}
