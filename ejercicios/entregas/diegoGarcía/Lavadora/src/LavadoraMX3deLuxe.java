public class LavadoraMX3deLuxe extends LavadoraMX {
    public LavadoraMX3deLuxe () {
        super(); //LavadoraMX
        _pr_disponibles= new ProgramaLavado[5];
        _pr_disponibles[0] = new ProgramaLavado("Largo Normal", 5, 65, 80, true, false);
        _pr_disponibles[1] = new ProgramaLavado("Largo Especial", 5, 72, 85, true, true);
        _pr_disponibles[2] = new ProgramaLavado("Corto Normal", 3, 45, 60, true, false);
        _pr_disponibles[3] = new ProgramaLavado("Especial Lana", 3, 40, 60, false, false);
        _pr_disponibles[4] = new ProgramaLavado("Economico", 3, 45, 45, true, false);
        _selector = new SelectorTemperatura ();
    }
}
