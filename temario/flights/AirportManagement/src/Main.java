import main.core.Airline;
import main.exceptions.EmptyException;
import main.utils.FileHandler;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws EmptyException {
        List<Airline> airlines = new ArrayList<>();

        FileHandler fileHandlerExample = new FileHandler();

        for (String airline: fileHandlerExample.loadFileContent("")) {
            String[] rawData;
            rawData = airline.split(",");

            int id;
            id = Integer.parseInt(rawData[0]);

            String name;
            name = rawData[1];

            String country;
            country = rawData[5];
            boolean active;

            if(rawData[6]=="Y") {
                active = true;
            }else{
                active = false;
            }

            airlines.add(new Airline(id, name , country, active));
        }

        Scanner scanner = new Scanner(System.in);
        String desiredCountry = scanner.nextLine();
        printAirlinesByCountry(desiredCountry, airlines);
    }

    public static void printAirlinesByCountry(String desiredCountry, List<Airline> airlines) {
        for (Airline airline : airlines) {
            if (airline.country().equals(desiredCountry)) {
                System.out.println(airline);
            }
        }
    }
}