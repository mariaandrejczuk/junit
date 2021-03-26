package pl.szymonleyk.junit;

public class Person {
    private String name;
    private String pesel;

    public Person(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getNameFromPesel() {
        return pesel.substring(0, 2);
    }
}
