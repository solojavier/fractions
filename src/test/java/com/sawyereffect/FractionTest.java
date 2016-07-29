package com.sawyereffect;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Before
    public void setUp() {
    }

    @Test
    public void sumWithSameDenominator() {
        Fraction result = new Fraction(7, 5).add(new Fraction(4, 5));

        assertEquals(result.numerator, 11);
        assertEquals(result.denominator, 5);
    }

    @Test
    public void sumWithDifferentDenominator() {
        Fraction result = new Fraction(7, 3).add(new Fraction(4, 5));

        assertEquals(result.numerator, 47);
        assertEquals(result.denominator, 15);
    }
}
