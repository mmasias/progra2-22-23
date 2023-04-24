package main.core;

public record Airline(int id, String name, String country, boolean active) {
    //En términos simples, un record en Java es una forma rápida y sencilla de crear clases que solo almacenan datos
    // no tienen comportamientos específicos. Estas clases son inmutables, lo que significa que una vez creadas, no puedes cambiar sus valores.
    // Los records en Java nos permiten reducir la cantidad de código que escribimos para estas clases
    // ya que automáticamente generan ciertos métodos como constructores, equals(), hashCode() y toString().
}
