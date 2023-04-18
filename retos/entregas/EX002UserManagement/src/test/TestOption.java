package test;
import java.util.Arrays;
import clases.Option;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestOption {


    @Test
    void validateSetOption(){

        Option listaTest = new Option();
        Assertions.assertEquals(listaTest.getIndexOption(),0);
        listaTest.setOpciones("eliminar");
        listaTest.setOpciones("prueba");
        Assertions.assertEquals(listaTest.getIndexOption(),2);

    }

    @Test
    void validateGetOption(){

        Option lista = new Option();
        lista.setIndexOption(1);
        lista.setOpciones("index1");
        Assertions.assertEquals(lista.toString(),"[null, index1]");
    }

    @Test
    void validateGetMaxOpciones(){

        Option tamañoLista = new Option();
        int maxOption=2;
        int check = tamañoLista.getMaxOpciones();
        Assertions.assertEquals(check, maxOption);
    }

    @Test
    void validateSetTamañoLista(){

        Option tamañoLista = new Option();
        int value = 4;
        int sizeUpload = tamañoLista.setMaxOpciones(value);
        Assertions.assertEquals(tamañoLista.getMaxOpciones(),sizeUpload);

    }

    @Test
    void validateGetIndex(){

        Option tamañoLista = new Option();
        int check = tamañoLista.getIndexOption();
        Assertions.assertEquals(check,0);
        tamañoLista.setOpciones("add");
        int check2 = tamañoLista.getIndexOption();
        Assertions.assertEquals(check2,1);
    }

    @Test
    void validateSetIndex(){
        Option tamañoLista = new Option();

        tamañoLista.setIndexOption(10);
        Assertions.assertEquals(tamañoLista.getIndexOption(),10 );


    }

}
