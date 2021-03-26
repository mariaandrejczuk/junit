package pl.szymonleyk.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @ParameterizedTest
    @CsvSource({"Jurek, 99011202235, 99", "Kasia, 88021114156, 88"})
    public void isCorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getNameFromPesel();
        //then
        assertEquals(year, yearResult);
    }
}
