package main.ex1;

public class Appointment {
    private Client owner;
    private Pet pet;
    private CustomDate date;
    private String description;

    public Appointment(Client owner, Pet pet, CustomDate date) {
        this.owner = owner;
        this.pet = pet;
        this.date = date;
    }

    public String toString() {
        return pet.getName() + " - " + owner.getFullName() + " - " + date.format("dd/MM/yyyy");
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    // Getters and Setters

    public Client getOwner() {
        return owner;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setDate(CustomDate date) {
        this.date = date;
    }

    public CustomDate getDate() {
        return date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
