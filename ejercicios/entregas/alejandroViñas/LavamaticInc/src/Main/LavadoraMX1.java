package Main;

class LavadoraMX1 extends LavadoraMX {
    public LavadoraMX1 () {
        super(); //LavadoraMX
        _pr_disponibles= new ProgramaLavado[3];
        _pr_disponibles[0] = new ProgramaLavado
                ("Largo Normal", 5, 65, 80, true, false);
        _pr_disponibles[1] = new ProgramaLavado
                ("Largo Especial", 5, 72, 85, true, true);
        _pr_disponibles[2] = new ProgramaLavado
                ("Corto Normal", 3, 45, 60, true, false);
    }
}

