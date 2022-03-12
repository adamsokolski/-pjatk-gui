package wyklady.w2.model;

public class Student extends Person{
    protected String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String getDesc() {
        return "Student: " + id;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                "}";
    }

    @Override
    public int compareTo(Object o) {
        Student stud = (Student) o;
        // return this.getAge() - stud.getAge();
        return this.id.compareTo(stud.id);
    }

    public int compareTo(Student stud) {
        return this.id.compareTo(stud.id);
    }
}
