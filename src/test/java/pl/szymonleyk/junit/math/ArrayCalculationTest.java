package pl.szymonleyk.junit.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCalculationTest {

    @Test
    public void minValueIs1() {
        //given
        int[] tab = {4, 6, 1, 2, 66};

        //when
        int min = ArrayCalculation.min(tab);

        //then
        assertEquals(1, min);
    }

    @Test
    public void minValueIsMinus5() {
        //given
        int[] tab = {4, 6, -5, 2, 26};

        //when
        int min = ArrayCalculation.min(tab);

        //then
        assertEquals(-5, min);
    }

    @Test
    public void minValueIs1000() {
        //given
        int[] tab = {465465, 101016, 6552542, 255111, 1000};

        //when
        int min = ArrayCalculation.min(tab);

        //then
        assertEquals(1000, min);
    }

    @Test
    public void minValueIsNot1000() {
        //given
        int[] tab = {465465, 101016, 6552542, -500, 255111, 1000};

        //when
        int min = ArrayCalculation.min(tab);

        //then
        assertNotEquals(1000, min);
    }

    @Test
    public void maxValueIs6552542() {
        //given
        int[] tab = {465465, 101016, 6552542, -500, 255111, 1000};

        //when
        int max = ArrayCalculation.max(tab);

        //then
        assertEquals(6552542, max);
    }

    @Test
    public void maxValueIs66() {
        //given
        int[] tab = {4, 6, 1, 2, 66};

        //when
        int max = ArrayCalculation.max(tab);

        //then
        assertEquals(66, max);
    }

    @Test
    public void maxValueIsNot1000() {
        //given
        int[] tab = {465465, 101016, 6552542, -500, 255111, 1000};

        //when
        int max = ArrayCalculation.max(tab);

        //then
        assertNotEquals(1000, max);
    }

    @Test
    public void avgOf111111() {
        //given
        int[] tab = {1, 1, 1, 1, 1, 1};

        //when
        int avg = ArrayCalculation.avg(tab);

        //then
        assertEquals(1, avg);
    }

    @Test
    public void avgOf24And42Is33() {
        //given
        int[] tab = {24, 42};

        //when
        int avg = ArrayCalculation.avg(tab);

        //then
        assertEquals(33, avg);
    }

    @Test
    public void avgOf24And42IsNot3() {
        //given
        int[] tab = {24, 42};

        //when
        int avg = ArrayCalculation.avg(tab);

        //then
        assertNotEquals(3, avg);
    }
    @Test
    public void medianOf421Is2() {
        //given
        int[] tab = {4, 2, 1};

        //when
        int median = ArrayCalculation.median(tab);

        //then
        assertEquals(2, median);
    }
    @Test
    public void medianOf5125Is3coma5() {
        //given
        int[] tab = {5, 1, 2, 5};

        //when
        int median = ArrayCalculation.median(tab);

        //then
        assertEquals(3.5, median);
    }
}

