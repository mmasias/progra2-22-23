package main.ex1;

public class CustomDate {
    private int day;
    private int month;
    private int year;

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);
    }

    public String format(String format) {
        return new SimpleDateFormat(format).format(toDate());
    }

    public Date toDate() {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(this.toString());
        } catch (ParseException e) {
            return null;
        }
    }
}

