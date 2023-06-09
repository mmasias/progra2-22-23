import static org.junit.jupiter.api.Assertions.*;
class PruebaCuenta {
CuentaBanco i,j,k;
    @org.junit.jupiter.api.BeforeEach
    void ConfiguracionBanco() {
        i = new CuentaBanco("Adrian", 450500);
        j = new CuentaBanco("Saul", 125520);
        k = new CuentaBanco("Pedro", 385450);
        j.depositodinero(125700);
        k.depositodinero(95820);
        k.retirardinero(15500);   }
    @org.junit.jupiter.api.AfterEach
    void demoler() {  }
    @org.junit.jupiter.api.Test
    void ObtenerTitularCuenta() {   }
    @org.junit.jupiter.api.Test
    void EstablecerTitularCuenta() {   }
    @org.junit.jupiter.api.Test
    void obtenerCuenta() {  }
    @org.junit.jupiter.api.Test
    void establecerCuenta() {  }
    @org.junit.jupiter.api.Test
    void depositodinero() {
        ConfirmarIgualdad (8800,i.getAmount()); }
    @org.junit.jupiter.api.Test
    void retirardinero() {
        d.retirardinero(585585585);
        ConfirmarIgualdad(0,k.obtenerCuenta());    }}