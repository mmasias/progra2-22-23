// Define the ComplexNumbers class
class ComplexNumbers {
    // Define the main method that will be executed
    public static void main(String[] args) {
        // Create a complex number a with real part 5.4 and imaginary part -67.0
        ComplexNumber a = new ComplexNumber(5.4, -67.0);
        // Create a new complex number b with default real and imaginary parts of 0
        ComplexNumber b = new ComplexNumber();

        // Print the string representations of the complex numbers a and b along with their moduli
        System.out.println("a = " + a + "," + a.modulo());
        System.out.println("b = " + b + "," + b.modulo());

        // Compare the moduli of a and b using the biggerThan() method
        if (a.biggerThan(b)) {
            // If a is bigger than b, print the appropriate message
            System.out.println("a is bigger than b");
        } else {
            // Otherwise, print the opposite message
            System.out.println("b is bigger than a");
        }
    }
}

// Define the ComplexNumber class
class ComplexNumber {
    // Define the private instance variables for the real and imaginary parts of the complex number
    private double real;
    private double imag;

    // Define a constructor with no arguments that sets the default values of real and imag to 0
    public ComplexNumber() {
        this.real = 0;
        this.imag = 0;
    }

    // Define a constructor with two arguments that initializes real and imaginary to the given values
    public ComplexNumber(double real, double imaginario) {
        this.real = real;
        this.imag = imag;
    }

    // Define a method that calculates and returns the modulus of the complex number
    public double modulo() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }

    // Define a method that compares the modulus of the current complex number with another complex number
    public boolean biggerThan(ComplexNumber c) {
        return this.modulo() > c.modulo();
    }

    // Define a method that returns a string representation of the complex number in the form of "real+imaginary"
    public String toString() {
        return this.real + "+" + this.imag + "i";
    }
}