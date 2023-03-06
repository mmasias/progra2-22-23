package src;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.students = new Student[capacity];
        this.position = 0;
        this.isOrdered = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;//Esto retorna el nombre del subject
    }

    public Student[] getStudents() {
        return students;//Esto retorna los estudiantes del subject
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public boolean getIsOrdered() {
        return isOrdered;//Esto retorna si el subject esta ordenado
    }

    public void setIsOrdered(boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public int getPosition() {
        return position;//Esto retorna la posicion del subject
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getCapacity() {
        return capacity;//Esto retorna la capacidad del subject
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addStudent(Student student) {//Esto agrega un estudiante al subject
        if (position < capacity) {
            students[position] = student;
            position++;
            isOrdered = false;
        } else {
            System.out.println("La asignatura está completa.");
        }
    }

    public void orderStudents() {//Esto ordena los estudiantes del subject
        if (!isOrdered) {
            Arrays.sort(students, 0, position, Comparator.comparing(Student::getGrade).reversed());
            isOrdered = true;
        }
    }

    public Student getStudent(int position) {//Esto retorna un estudiante del subject
        return students[position];
    }

    public Student getBestStudent() {//Esto retorna el estudiante con mayor nota
        if (position > 0) {
            if (!isOrdered) {
                orderStudents();
            }
            return students[0];
        } else {
            System.out.println("No hay alumnos matriculados.");
            return null;
        }
    }

    public Student getWorstStudent() {//Esto retorna el estudiante con menor nota
        if (position > 0) {
            if (!isOrdered) {
                orderStudents();
            }
            return students[position - 1];
        } else {
            System.out.println("No hay alumnos matriculados.");
            return null;
        }
    }

    public float getAverage() {//Esto retorna el promedio de los estudiantes del subject
        int sum = 0;
        for (int i = 0; i < position; i++) {
            sum += students[i].getGrade();
        }
        return sum / position;
    }

    public float getMedian() {//Esto retorna el promedio de los estudiantes del subject
        if (position > 0) {
            if (!isOrdered) {
                orderStudents();
            }
            if (position % 2 == 0) {
                return students[position / 1].getGrade();
            } else {
                return (students[(position - 1) / 2].getGrade() + students[position / 2].getGrade()) / 2;
            }
        }
        System.out.println("No hay alumnos matriculados.");
        return 0;

    }



    public String getAverageGrade() {//Esto retorna el promedio de los estudiantes del subject

        if (position > 0) {
            if (!isOrdered) {
                orderStudents();
            }
            float sum = 0;
            for (int i = 0; i < position; i++) {
                sum += students[i].getGrade();
            }
            return String.format("%.2f", sum / position);
        }
        System.out.println("No hay alumnos matriculados.");
        return null;
    }
}
