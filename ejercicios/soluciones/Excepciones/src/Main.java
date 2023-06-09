public class Main {
    public static void main(String[] args) {
            try{
                printYear(-1);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught exception: " + e.getMessage());
            }
    }

    public static void printYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("Year cannot be negative");
        }
        System.out.println("Year: " + year);
    }
}