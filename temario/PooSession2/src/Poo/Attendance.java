package Poo;

import java.util.Date;

public class Attendance {
    private Student student;
    private String time;

    public Attendance(){
        // Generate current time
        this.time = new Date().toString();
    }

}
