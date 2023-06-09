@startuml
class Subject{
    + void addStudent(Student student)
    + void orderStudents()
    + double getAverage()
    + float getMedian()
    + int getPosition()
    + Student getBestStudent()
    + Student getWorstStudent()
    - String name
    - Student[] students
    - boolean isOrdered
    - int position
    - int capacity}
class Student{
    + void setGrade()
    + float getGrade()
    + String getName()
    + void setName()
    + String getSurname()
    + void setSurname()
    + String getId()
    + void setId()
    - String name
    - String surname
    - String id
    - float grade}
@enduml