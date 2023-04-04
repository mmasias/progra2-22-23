package org.example;

public class Complejo implements Comparable{
    private double p_real;
    private double p_imag;
    //Constructores
    public Complejo (double x, double y){}
    public Complejo () {

    }
    //Métodos propios del tipo Complejo
    public double modulo() {
        return (Math.sqrt(Math.pow(p_real, 2) + Math.pow(p_imag, 2)));
    }
    public double real(){
        return (p_real);
    }
    public double imaginario () {
        return (p_imag);
    }
    //Redefiniciones de Object
    public String toString (){
        return (p_real + " + " + p_imag + "i");
    }
        public boolean equals ( Object x ){
            if (this.modulo() == ((Complejo) x).modulo()){
                return (true);
            }
            else {
                return (false);
            }}
    // Implementación de la interfaz Comparable
        public boolean greaterThan ( Comparable arg ) {
            if (this.modulo() > ((Complejo) arg).modulo()) return (true);
            else return (false);
        }
        //Implementación: privado

}