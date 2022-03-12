package cwiczenia.c01.Ex1;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHelloTo(Person p) {
        System.out.println("Hello " + p.getName() + "!");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
