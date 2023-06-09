package main.utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class FileHandler {

    private List<String>
    public List<String> load(String path) {

        if (path = null || path.lengh()<1){
            System.err.println("Nombre no valido");
            return mull;
        }

        BufferReader input = null;
        File file = new File(path);
        if (file.exists()){
            System.err.println("No existe el archivo");
            return null;
        }

        try{
            input = new BufferedReader(new FileReader(file));

            while (input.ready()){
                String line = input.readLine();
                this.lines.add(line);
            }

        } catch (FileNotFoundException e){
            System.err.println("No se encuentra el archivo");
        }
    }
}
