package Main;

class ProgramaLavado {
    public ProgramaLavado (String nom, int nfases, int tiempo,
                           int cons_agua, boolean centr, boolean prel) {
        _nombre = nom;
        _num_fases = nfases;
        _duracion = tiempo;
        _consumo_agua = cons_agua;
        _centrifugado = centr;
        _prelavado = prel;
    }
    public void activar () {
        if ( _prelavado ) System.out.println("Prelavado");
        for (int i=1; i<=_num_fases; i++)
            System.out.println("Fase " + i);
        if ( _centrifugado ) System.out.println("centrifugado");
        System.out.println("Fin del programa " + _nombre);
    }
    public int consumoAgua () {
        return ( _consumo_agua );
    }
    public String nombre () { return ( _nombre ); }
    public int duracion () { return ( _duracion ); }
    private String _nombre;
    private int _num_fases;
    private int _duracion;
    private int _consumo_agua;
    private boolean _centrifugado;
    private boolean _prelavado;
}
