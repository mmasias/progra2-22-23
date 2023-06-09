package Main.Utils;

public class FileParser extends FileHandler1 {
    public FileParser() {
    }

    FileParser parsearDatos = new FileParser();

    public FileParser getParsearDatos() {
        return parsearDatos;
    }

    public void setParsearDatos(String path) {

        FileParser f1 = new FileParser();

        f1.loadFileContent(path);





    }
}
