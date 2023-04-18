package test;

import clases.Manager;
import clases.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void validateSetUsuario() {

       User us1 = new User("dani", "1", "daniel");
       Manager m1 = new Manager(3);
       m1.addUsuario(us1);

       Assertions.assertEquals(m1.getSize(),1);
    }

    @Test
    void validateAutentificacion(){

        User u1 = new User("dani", "1", "jorge");
        Manager m1 = new Manager(3);

        m1.addUsuario(u1);



        Assertions.assertEquals(m1.autentificarUsuario("dani", "1"),true);

    }

    @Test
    void validateSize(){

        User u1 = new User();

        Manager m1 = new Manager(3);

        Assertions.assertEquals(m1.getSize(),0);

        m1.addUsuario(u1);

        Assertions.assertEquals(m1.getSize(),1);


    }
}