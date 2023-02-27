package edai.tema2.ejercicio1;
import edai.collections.List;
public class AddressBook {
    private final List<Contact> contacts = new List();

    public AddressBook() {

    }

    public List<String> getContactNames() {
        List<String> names = new List();
        Object[] var2 = this.contacts.listData();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; var4++) {
            Object contact = var2[var4];
            Contact data = (Contact) contact;
            names.insert(data.getLastName() + ", " + data.getFirstName(), -1);
        }
        return names;
    }

    public Contact getContact(String name) {
        Object[] var2 = this.contacts.listData();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; var4++) {
            Object contact = var2[var4];
            Contact data = (Contact) contact;
            if ((data.getLastName() + ", " + data.getFirstName()).equals(name)) {
                return data;
            }
        }

        return null;
    }

    public void addContact(Contact contact) {
        this.contacts.insert(contact, -1);
    }

    public String exportToCsv() {
        String csv = "first-name,last-name,company,address,email";
        Object[] var2 = this.contacts.listData();
        int var3 = var2.length;

        for (int var4 = 0; var4 < var3; var4++) {
            Object contact = var2[var4];
            Contact data = (Contact) contact;
            csv = csv + String.format("\n%s,%s,%s,%s,%s", data.getFirstName(), data.getLastName(), data.getCompany(), data.getAddress(), data.getEmail());
        }
        return csv;
    }
}
