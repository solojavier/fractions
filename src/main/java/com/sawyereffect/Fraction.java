package com.sawyereffect;

public class Fraction {

    public int numerator;
    public int denominator;


    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be 0");
        }
        this.numerator  = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction addend) {
        if (this.denominator == addend.denominator) {
            int numeratorSum = this.numerator + addend.numerator;
            return new Fraction(numeratorSum, this.denominator);
        } else {
            int numeratorSum = (this.numerator * addend.denominator) + (addend.numerator * this.denominator);
            return new Fraction(numeratorSum, this.denominator * addend.denominator);
        }
    }
}
