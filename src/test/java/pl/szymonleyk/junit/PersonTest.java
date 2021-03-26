package pl.szymonleyk.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @ParameterizedTest
    @CsvSource({"Jurek, 99012101122, 1999", "Kasia, 880211014456, 1988", "Marek, 15211202235, 2015", "Julia, 02221114156, 2002"})
    public void isCorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getNameFromPesel();
        //then
        assertEquals(year, yearResult);
    }
    @ParameterizedTest
    @CsvSource({"Marian, 12011202235, 1982", "Maria, 41021114156, 1992"})
    public void isIncorrectYear(String name, String pesel, String year){
        //given
        Person person = new Person(name, pesel);
        //when
        String yearResult = person.getNameFromPesel();
        //then
        assertNotEquals(year, yearResult);
    }
}
