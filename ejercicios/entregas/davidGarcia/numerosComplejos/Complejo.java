public class Complejo {
    private double real;
    private double imag;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imag = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double modulo() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }
    public boolean mayorQue(Complejo otro) {
        return this.modulo() > otro.modulo();
    }


    @Override
    public String toString() {
        if (imag < 0) {
            return real + " - " + Math.abs(imag) + "i";
        } else {
            return real + " + " + imag + "i";
        }
    }
}
