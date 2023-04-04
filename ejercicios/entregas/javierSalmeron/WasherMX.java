class WashingProgram {
    String programName;

    public WashingProgram(String programName) {
        this.programName = programName;
    }

    public String getProgramName() {
        return programName;
    }
}

class TemperatureSelector {
    int temperature;

    public TemperatureSelector(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

class WasherMX {
    String modelName;
    WashingProgram[] washingPrograms;
    TemperatureSelector temperatureSelector;

    public WasherMX(String modelName, WashingProgram[] washingPrograms, TemperatureSelector temperatureSelector) {
        this.modelName = modelName;
        this.washingPrograms = washingPrograms;
        this.temperatureSelector = temperatureSelector;
    }

    public void printWasherInfo() {
        System.out.println("Model: " + modelName);
        System.out.println("Washing Programs:");
        for (WashingProgram program : washingPrograms) {
            System.out.println("  - " + program.getProgramName());
        }
        if (temperatureSelector != null) {
            System.out.println("Temperature Selector: Yes (Current Temp: " + temperatureSelector.getTemperature() + "°C)");
        } else {
            System.out.println("Temperature Selector: No");
        }
    }

    public static void main(String[] args) {
        WashingProgram[] mx1Programs = {new WashingProgram("Long"), new WashingProgram("Long with Pre-Laughed"), new WashingProgram("Short")};
        WashingProgram[] mx2Programs = {new WashingProgram("Long"), new WashingProgram("Long with Pre-Laughed"), new WashingProgram("Short")};
        WashingProgram[] mx3DeluxePrograms = {new WashingProgram("Long"), new WashingProgram("Long with Pre-Laughed"), new WashingProgram("Short"), new WashingProgram("Special Wool"), new WashingProgram("Economic")};

        WasherMX mx1 = new WasherMX("MX1", mx1Programs, null);
        WasherMX mx2 = new WasherMX("MX2", mx2Programs, new TemperatureSelector(40));
        WasherMX mx3Deluxe = new WasherMX("MX3Deluxe", mx3DeluxePrograms, new TemperatureSelector(40));

        mx1.printWasherInfo();
        System.out.println("--------------------");
        mx2.printWasherInfo();
        System.out.println("--------------------");
        mx3Deluxe.printWasherInfo();
    }
}
