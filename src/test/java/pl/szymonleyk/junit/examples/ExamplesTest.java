package pl.szymonleyk.junit.examples;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
