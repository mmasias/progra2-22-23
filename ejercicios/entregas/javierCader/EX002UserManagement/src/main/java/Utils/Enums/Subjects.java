package Utils.Enums;

public enum Subjects {
    PROGRAMMING_II("Programming II"),
    MATHEMATICS_II("Mathematics II"),
    LOGIC("Logic"),
    DISCRETE_MATHEMATICS("Discrete Mathematics"),
    ICT("ICT");

    private final String stringValue;
    Subjects(String stringValue) {
        this.stringValue = stringValue;
    }
    public String getStringValue() {
        return stringValue;
    }
}
