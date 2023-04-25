package main.ex1;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ManagementSystemTest {

    private ManagementSystem system;

    @Before
    public void setUp() {
        system = ManagementSystem.create();
    }

    @Test
    public void testLoadClients() {
        system.loadData("clients.dat");
        List<Client> clients = system.getClients();
        assertEquals(64, clients.size());
    }

    @Test
    public void testAddAppointment() {
        // Add a client
        Client client = new Client("John", "Doe", "123 Main St", "555-1234");
        system.getClients().add(client);

        // Add an appointment for the client
        Pet pet = new Pet("Fido", Species.DOG);
        CustomDate date = new CustomDate(2023, 4, 30, 10, 0);
        Appointment appointment = new Appointment(client, pet, date);
        system.addAppointment(client, pet, date);

        List<Appointment> appointments = system.getAppointments();
        assertTrue(appointments.contains(appointment));

        // Try to add an appointment for a non-existent client
        Client nonExistentClient = new Client("Jane", "Doe", "456 Main St", "555-5678");
        Pet anotherPet = new Pet("Fluffy", Species.CAT);
        CustomDate anotherDate = new CustomDate(2023, 5, 1, 11, 0);
        system.addAppointment(nonExistentClient, anotherPet, anotherDate);

        appointments = system.getAppointments();
        assertFalse(appointments.contains(new Appointment(nonExistentClient, anotherPet, anotherDate)));
    }
}

