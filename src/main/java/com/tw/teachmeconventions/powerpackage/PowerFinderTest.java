package com.tw.teachmeconventions.powerpackage;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
    @Test
    public void shouldReturnOneIfBaseIsOneAndPowerIsOne() {
        PowerFinder p= new PowerFinder();
        int calculated_answer = p.baseRaisedToPower(1,1);
        assertEquals(1,calculated_answer);
    }

    @Test
    public void shouldReturnTwoIfBaseIsTwoAndPowerIsOne() {
        PowerFinder p= new PowerFinder();
        int calculated_value = p.baseRaisedToPower(2,1);
        assertEquals(2,calculated_value);
    }

    @Test
    public void shouldReturnFourIfBaseIsTwoAndPowerIsTwo() {
        PowerFinder p= new PowerFinder();
        int calculated_value=p.baseRaisedToPower(2,2);
        assertEquals(4,calculated_value);
    }

    @Test
    public void shouldReturnNineIfBaseIsThreeAndPowerIsTwo() {
        PowerFinder p= new PowerFinder();
        int calculated_value=p.baseRaisedToPower(3,2);
        assertEquals(9,calculated_value);
    }
}
