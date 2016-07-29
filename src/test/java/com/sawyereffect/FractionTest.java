package com.sawyereffect;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FractionTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidDenominator() {
        new Fraction(3, 0);
    }

    @Test
    public void sumWithSameDenominator() {
        Fraction result = new Fraction(7, 5).add(new Fraction(4, 5));

        assertEquals(result.getNumerator(), 11);
        assertEquals(result.getDenominator(), 5);
    }

    @Test
    public void sumWithDifferentDenominator() {
        Fraction result = new Fraction(7, 3).add(new Fraction(4, 5));

        assertEquals(result.getNumerator(), 47);
        assertEquals(result.getDenominator(), 15);
    }

    @Test
    public void sumIntegers() {
        Fraction result = new Fraction(2, 1).add(new Fraction(2, 1));

        assertEquals(result.getNumerator(), 4);
        assertEquals(result.getDenominator(), 1);
    }

    @Test
    public void expressFractionsInLowestTerms() {
        Fraction result = new Fraction(3, 5).add(new Fraction(2, 10));

        assertEquals(result.getNumerator(), 4);
        assertEquals(result.getDenominator(), 5);
    }
}
