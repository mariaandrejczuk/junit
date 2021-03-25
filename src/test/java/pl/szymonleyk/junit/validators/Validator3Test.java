package pl.szymonleyk.junit.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Validator3Test {
    @Test
    public void isValidIfNumberIs3Digit(){
        //given
        String threeDigitNumber = "125";
        //when
        boolean isValid = Validator3.digitValidation(threeDigitNumber);
        //then
        assertTrue(isValid);
    }
    @Test
    public void isNotValidIfNumberIs4Digit(){
        //given
        String threeDigitNumber = "1225";
        //when
        boolean isValid = Validator3.digitValidation(threeDigitNumber);
        //then
        assertFalse(isValid);
    }
}
