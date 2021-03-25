package pl.szymonleyk.junit.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayCalculationTest {

    public void minValueIs1() {
    //given
    int[] tab = {4, 6, 1, 2, 66};

    //when
        int min = ArrayCalculation.min(tab);

    //then
        assertEquals(1, min);
        }
    }
}
