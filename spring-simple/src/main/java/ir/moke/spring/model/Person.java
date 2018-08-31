package ir.moke.spring.model;

public class Person {
    private String name ;
    private String family ;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
