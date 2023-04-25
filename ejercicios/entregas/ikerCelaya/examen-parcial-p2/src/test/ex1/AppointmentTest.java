package test.ex1;

import main.ex1.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @Test
    @DisplayName("Print the appointment in the format: [dd/mm/yyyy] - owner full name - pet name - description")
    void testToString() {
        Pet dog = new Dog("Fido", "Black", 5);
        CustomDate date = new CustomDate(25, 3, 2023);

        Client client = new Client("Emily", "Smith", "123 Main St, Los Angeles", "123456789");

        Appointment appointment = new Appointment(dog, date, "Vaccination");
        appointment.setOwner(client);

        String expectedAppointment = "[25/03/2023] - Emily Smith - Fido - Vaccination";
        String actualAppointment = appointment.toString();

        assertEquals(expectedAppointment, actualAppointment);
    }

}