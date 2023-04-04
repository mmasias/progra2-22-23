package org.example;

class ComplejoTest {
    public static void main(String[] args) {
        Complejo a = new Complejo(5.4, -67.0);
        Complejo b = new Complejo();
        System.out.println("a = " + a + " , " + a.modulo());
        System.out.println("b = " + b + " , " + b.modulo());
        if(a.greaterThan(b)){
            System.out.println("a is greater b");
        } else {
        System.out.println("a is not greater than b");
        }
    }

}