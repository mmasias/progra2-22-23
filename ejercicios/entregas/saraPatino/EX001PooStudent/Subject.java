public class Subject {
  private String name;
  private Student[] students;
  private boolean isOrdered;
  private int position;
  private int capacity;

  public Subject(String name, int capacity) {
    this.name = name;
    this.students = new String[capacity];
    this.isOrdered = false;
    this.position = 0;
    this.capacity = capacity;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String[] getStudents() {
    return this.students;
  }

  public void setStudents(String[] students) {
    this.students = students;
  }

  public boolean isIsOrdered() {
    return this.isOrdered;
  }

  public boolean getIsOrdered() {
    return this.isOrdered;
  }

  public void setIsOrdered(boolean isOrdered) {
    this.isOrdered = isOrdered;
  }

  public int getPosition() {
    return this.position;
  }

  public void setPosition(int position) {
    this.position = position;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void addStudent(String student) {
    if (this.position < this.capacity) {
      this.students[this.position] = student;
      this.position++;
      this.isOrdered = false;
    } else {
      System.out.println("The subject is full");
    }
  }

  public void orderStudents() {
    if (!this.isOrdered) {
      for (int i = 0; i < this.position; i++) {
        for (int j = i + 1; j < this.position; j++) {
          if (this.students[i].compareTo(this.students[j]) > 0) {
            String aux = this.students[i];
            this.students[i] = this.students[j];
            this.students[j] = aux;
          }
        }
      }
      this.isOrdered = true;
    }
  }

  public void getStudent(int position) {
    if (position == this.position) {
      System.out.println(this.students[position]);
    } else {
      System.out.println("The position is out of range");
    }
  }

  public String getBestStudent() {
        orderStudents();
        this.orderStudents();

        return students[0].getName() + " " + students[0].getSurname();
    }

  public String getWorstStudent() {
        orderStudents();
        this.orderStudents();

        return students[students.length - 1].getName() + " " + students[students.length - 1].getSurname();
    }

  public float getAverage() {
        float average = 0;
        for (int i = 0; i < students.length; i++) {
            average += students[i].getGrade();
        }
        return average / students.length;
    }

  public float getMedian(){
        orderStudents();
        this.orderStudents();
        if (students.length % 2 == 0) {
            return (students[students.length / 2].getGrade() + students[students.length / 2 - 1].getGrade()) / 2;
        } else {
            return students[students.length / 2].getGrade();
        }
  }
  
}
