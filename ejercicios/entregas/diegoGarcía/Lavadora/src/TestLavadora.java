public class TestLavadora {
    public static void main (String[] args) {
        LavadoraMX mi_lavadora;

        mi_lavadora = new LavadoraMX1 ();
        System.out.println("LavadoraMX1");
        manipular (mi_lavadora);

        mi_lavadora = new LavadoraMX2 ();
        System.out.println("LavadoraMX2");
        manipular (mi_lavadora);

        mi_lavadora = new LavadoraMX3deLuxe ();
        System.out.println("LavadoraMX3deLuxe");
        manipular (mi_lavadora);
    }
    private static void manipular (LavadoraMX l) {
        l.infoPrograma();
        l.programar();
        l.infoPrograma();
        l.ponerEnMarcha();
    }
}
