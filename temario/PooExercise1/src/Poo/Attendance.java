package Poo;

import java.util.Date;

public class Attendance {
    private Student student;
    private String time;

    public Attendance(Student student){
        this.student = student;
        this.time = new Date().toString();
    }
}
