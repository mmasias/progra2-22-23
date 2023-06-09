import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String palabra = "hola mundo";

        int tamañoArray = palabra.length();
        char [] caracteres = new char[tamañoArray];

        for (int i=0; i<tamañoArray;i++){

          caracteres[i]=palabra.charAt(i);
        }

        for (int i=0; i< caracteres.length; i++){

            System.out.println(caracteres[i]);
        }

        int contador = 0;

        for (int i = 0; i < caracteres.length; i++) {
            for (int j = 0 ; j < caracteres.length; j++)
                if(caracteres[i] == caracteres[j])
                    contador++;
            System.out.print(contador + ",");
            contador = 0;
        }
    }
}