package test.ex1;

import main.ex1.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class AppointmentTest {

    @Test
    public void testToString() {
        Client owner = new Client("John", "Doe", "123 Main St", "555-5555");
        Pet pet = new Pet("Fido", Species.DOG, 5);
        CustomDate date = new CustomDate(2022, 4, 26, 13, 0);
        Appointment appointment = new Appointment(owner, pet, date);

        String expected = "[26/04/2022] - John Doe - Fido - ";
        assertEquals(expected, appointment.toString());
    }
}


