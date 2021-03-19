package pl.szymonleyk.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse; //import statyczny, importuję statyczną metodę i mogę do niej się odwołać bez podawania klasy, w której się znajduje

public class ValidatorTest {
    @Test
    public void isNotValidIfLength4(){
        //given
        String pesel = "1555";
        //when
        boolean isValid = Validator.pedelValidation(pesel);
        //then
        assertFalse(isValid);
    }
}

