package cwiczenia.c01.Ex1;

public class Subject {
    private String name;
    private Person teacher;
    private final int studentsLimit = 500;
    private int currentStudents = 0;
    private Student[] students = new Student[studentsLimit];

    public Subject(String name) {
        this.name = name;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void addStudent(Student s) throws TooManyStudentsException {
        currentStudents++;
        if (currentStudents > studentsLimit) {
            throw new TooManyStudentsException();
        } else  {
            students[currentStudents - 1] = s;
        }
    }

    @Override
    public String toString() {
        StringBuilder studentList = new StringBuilder();
        for (int i = 0; i < currentStudents; i++) {
            studentList.append(students[i].getName()).append(", ");
        }
        return this.name + ", teacher: " + this.teacher.getName() + ", students: " + studentList;
    }
}
