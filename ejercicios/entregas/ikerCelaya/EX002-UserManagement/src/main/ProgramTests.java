package main;

import org.junit.Test;

public class ProgramTests {
    // Test that registers a series of users with customized options, and test a successful authentication (listing the options) and a failed authentication (displaying a message on the console).

    @Test
    public void testUser1() {
        User user1 = new User("Iker", "1234");
        String expectedName = "Iker";
        String expectedPassword = "1234";
        if (user1.getName().equals(expectedName) && user1.getPassword().equals(expectedPassword)) {
            System.out.println("Authentication successful! :)");
        }
        else {
            System.out.println("Authentication failed! :(");
        }


    }
    @Test
    public void testUser2() {
        User user2 = new User("John", "abcd");
        String expectedName = "John";
        String expectedPassword = "abcd";
        if (user2.getName().equals(expectedName) && user2.getPassword().equals(expectedPassword)) {
            System.out.println("Authentication successful! :)");
        } else {
            System.out.println("Authentication failed! :(");
        }
    }
}