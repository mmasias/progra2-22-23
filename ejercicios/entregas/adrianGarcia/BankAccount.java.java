public class CuentaBancaria {
       private String TitularCuenta;
       private double Cuenta;

    public CuentaBancaria(String TitularCuenta, double Cuenta) {
        this.titularCuenta=TitularCuenta;
        this.cuenta=Cuenta;}
    public double ObtenerCuenta() {
        return Cuenta;   }
    public void EstablecerCuenta(double Cuenta) {
        this.cuenta=Cuenta;  }
    public String ObetenerTitularCuenta() {
        return TitularCuenta; }
    public void EstablecerTitularCuenta(String TitularCuenta) {
        this.titularCuenta=TitularCuenta;  }
    public boolean depositodinero (double cantidad){
        boolean ok=false;
        if (cantidad>0){
            this.cuenta+=cantidad;
            ok=true;   }
        return ok;  }
    public boolean retirardinero (double dinero){
        boolean ok=false;
        if (Cuenta>=dinero){
            this.cuenta-=dinero;
         ok=true;
        }else{
            this.cuenta=0;    }
        return ok; }   }