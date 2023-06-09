package main.ex1;

public class Client {
    private String name;
    private String surname;
    private String address;
    private String phoneNumber;

    public Client(String name, String surname, String address, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Client other = (Client) obj;
        return name.equals(other.name) && surname.equals(other.surname) &&
                address.equals(other.address) && phoneNumber.equals(other.phoneNumber);
    }
}
