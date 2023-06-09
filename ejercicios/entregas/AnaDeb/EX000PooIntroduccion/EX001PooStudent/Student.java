class Student{
    private String name;
    private String surnames;
    private String dni;
    private float e;

    Alumno(String nomb, String ape, String dni, float nota){/** Implementar */}

//     Getters and Setters


    public void setNote(float n){

        note = n;
    }

    public float getNote(){

        return note;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name=name;
    }

    public String getSurnames(){

        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames=surnames;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {

        this.dni=dni;
    }

}