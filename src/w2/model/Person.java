package w2.model;

public abstract class Person implements Comparable {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getDesc();

    public int getAge(){
        return age;
    }

    public String getName() {
        return name;
    }

}
