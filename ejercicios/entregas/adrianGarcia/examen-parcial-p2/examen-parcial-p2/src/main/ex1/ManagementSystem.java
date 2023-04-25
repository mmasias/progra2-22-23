package main.ex1;

import java.util.ArrayList;
import java.util.List;

public class ManagementSystem {

    private FileHandler filehandler;
    private List<Client> clients;
    private List<Appointment> appointments;

    private ManagementSystem() {
        this.filehandler = new FileHandler();
        this.clients = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public static ManagementSystem create() {
        return new ManagementSystem();
    }

    public void loadData(String filePath) {
        List<String> lines = filehandler.loadFileContent(filePath);
        for (String line : lines) {
            String[] parts = line.split(",");
            String name = parts[0];
            String surname = parts[1];
            String address = parts[2];
            String phoneNumber = parts[3];

            Client client = new Client(name, surname, address, phoneNumber);
            clients.add(client);
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void addAppointment(Client owner, Pet pet, CustomDate date) {
        if (isClient(owner)) {
            Appointment appointment = new Appointment(owner, pet, date);
            appointments.add(appointment);
        } else {
            System.out.println("El cliente no está registrado en el sistema.");
        }
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public boolean isClient(Client client) {
        return clients.contains(client);
    }

    public List<Appointment> getAppointmentsByDate(String date) {
        List<Appointment> appointmentsByDate = new ArrayList<>();
        for (Appointment appointment : appointments) {
            String appointmentDate = appointment.getDate().format("dd-MM-yyyy");
            if (appointmentDate.equals(date)) {
                appointmentsByDate.add(appointment);
            }
        }
        return appointmentsByDate;
    }

    public void printAppointmentsByDate(List<Appointment> appointments, String date) {
        System.out.println("Citas programadas para el " + date + ":");
        for (Appointment appointment : appointments) {
            Pet pet = appointment.getPet();
            System.out.println("[" + appointment.getDate().format("dd-MM-yyyy HH:mm") + "] " + pet.getName() + " - " + appointment.getDescription());
        }
    }
}


