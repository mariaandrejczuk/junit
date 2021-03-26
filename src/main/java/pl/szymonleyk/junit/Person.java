package pl.szymonleyk.junit;

public class Person {
    private String name;
    private String pesel;

    public Person(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getNameFromPesel() {
        return "19"+pesel.substring(0, 2);  // zmodyfikuj metodę tak, aby działała również dla osób urodzonych w latach 2000+
    }
}
