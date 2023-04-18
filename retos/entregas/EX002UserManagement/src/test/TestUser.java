package test;
import clases.User;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;




public class TestUser {


    @Test
    void validateGetLogin(){

        User usuarioTest = new User();
        usuarioTest.setLogin("Daniel");
        String resultLogin = usuarioTest.getLogin();

        assertEquals(resultLogin,"Daniel");

    }

    @Test
    void validateGetPassword(){
        User usuarioTest = new User();
        usuarioTest.setPassword("1234");
        String resultPassword = usuarioTest.getPassword();

        assertEquals(resultPassword,"1234");

    }

    @Test
    void validateGetNameUser (){

        User usuarioTest = new User();
        usuarioTest.setNameUser("Dani");
        String resultName = usuarioTest.getNameUser();

        assertEquals(resultName,"Dani");


    }

    @Test
    void validateSetLogin(){

        User usTest = new User();
        assertEquals(usTest.getLogin(),""); // checking login is empty
        usTest.setLogin("hola@");
        String check = usTest.getLogin();
        assertEquals(check,"hola@");
    }

    @Test
    void validateSetPassword(){

        User usTest = new User();
        assertEquals(usTest.getPassword(),""); // checking password is empty
        usTest.setPassword("12");
        String check = usTest.getPassword();
        assertEquals(check,"12");
    }

    @Test
    void validateSetName(){

        User usTest = new User();
        assertEquals(usTest.getNameUser(),""); // checking name is empty
        usTest.setNameUser("dani");
        String check = usTest.getNameUser();
        assertEquals(check,"dani");
    }
}
