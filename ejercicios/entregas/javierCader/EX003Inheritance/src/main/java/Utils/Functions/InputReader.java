package Utils.Functions;

import java.util.Scanner;

public abstract class InputReader {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getUserOption() {
        return scanner.nextInt();
    }
}
