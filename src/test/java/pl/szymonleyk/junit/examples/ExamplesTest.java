package pl.szymonleyk.junit.examples;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesTest {
    @ParameterizedTest(name = "Person with age {0} is not adult.")
    @ValueSource(ints = {11, 2, 15, 5})
    // given
    public void isNotAdult(int age){
    // when
    boolean isAAdult = Examples.isAdult(age);
    // then
    assertFalse(isAAdult);
    }

    @ParameterizedTest(name = "Person with age {0} is adult.")
    @ValueSource(ints = {18, 22, 25, 66})
    // given
    public void isAdult(int age){
        // when
        boolean isAAdult = Examples.isAdult(age);
        // then
        assertTrue(isAAdult);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"55,5,60", "8,10,18", "-10,10,0"})
    public void isCorrectSum(int a, int b, int expectedResult){
        //when
        int result = Examples.sum(a,b);
        //then
        assertEquals(expectedResult, result);
    }

    @RepeatedTest(100)
    public void isFrom5To100(){
        //when
        int number = Examples.randFrom5To100();
        //then
        assertTrue(number >= 5 && number <= 100);
    }
}
