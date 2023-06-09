package main;

public class Complex implements IComparable {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex() {
        this(0, 0);
    }
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getModulus() {
        return Math.sqrt(
                Math.pow(real, 2) + Math.pow(imaginary, 2));
    }

    public String toString() {
        return String.format("%f + %fi", real, imaginary);
    }

    /*
     * Two complex numbers are equal if their real and imaginary parts
     * are equal
     */
    public boolean equals(Object object) {
        if (object instanceof Complex) {
            Complex complex = (Complex) object;
            return this.real == complex.real && this.imaginary == complex.imaginary;
        }
        return false;
    }

    public boolean greaterThan(IComparable object) {
        // Validate that the object is a Complex number
        if (object instanceof Complex) {
            Complex complex = (Complex) object;
            return this.getModulus() > complex.getModulus();
        }
        return false;
    }

    @Override
    public boolean lessThan(IComparable object) {
        if (object instanceof Complex) {
            Complex complex = (Complex) object;
            return this.getModulus() < complex.getModulus();
        }
        return false;
    }
}
