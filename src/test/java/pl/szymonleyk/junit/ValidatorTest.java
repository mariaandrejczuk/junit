package pl.szymonleyk.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse; //import statyczny, importuję statyczną metodę i mogę do niej się odwołać bez podawania klasy, w której się znajduje
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {
    @Test
    public void isNotValidIfLength4(){
        //given
        String pesel = "1555";
        //when
        boolean isValid = Validator.peselValidation(pesel);
        //then
        assertFalse(isValid);
    }
    @Test
    public void isValidIfLength11(){
        //given
        String pesel = "11115555555";
        //when
        boolean isValid = Validator.peselValidation(pesel);
        //then
        assertTrue(isValid);
    }
}

