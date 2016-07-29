package com.sawyereffect;

public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction add(Fraction addend) {
        int denominatorSum = this.denominator * addend.denominator;
        int numeratorSum = (this.numerator * addend.denominator) + (addend.numerator * this.denominator);

        int gcd = gcd(denominatorSum, numeratorSum);
        return new Fraction(numeratorSum / gcd, denominatorSum / gcd);
    }

    private static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }
}
