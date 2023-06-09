package Core.Email;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Email {
    private final String sender;
    private final String message;
    private final String date;

    public Email(String sender, String message) {
        this.sender = sender;
        this.message = message;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        this.date = LocalDate.now().format(formatter);
    }

    public String getSender() {
        return this.sender;
    }

    public String getMessage() {
        return this.message;
    }

    public String getDate() {
        return this.date;
    }

}
