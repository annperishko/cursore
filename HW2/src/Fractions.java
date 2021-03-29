

public class Fractions {
    private final short denominator;
    private final long numerator;


    public Fractions(long numerator, short denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can`t be 0");
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public long getNumerator() {
        return numerator;
    }

    public short getDenominator() {
        return denominator;
    }

    public Fractions sum(Fractions forSum) {
        long numRes = this.numerator * forSum.denominator +
                this.denominator * forSum.numerator;
        short detRes = (short) (this.denominator * forSum.denominator);
        return new Fractions(numRes, detRes);
    }

    public Fractions subtraction(Fractions forSubtraction) {
        long numRes = this.numerator * forSubtraction.denominator -
                this.denominator * forSubtraction.numerator;
        short detRes = (short) (this.denominator * forSubtraction.denominator);
        return new Fractions(numRes, detRes);
    }

    public Fractions multiplication(Fractions forMultiplication) {
        long numRes = this.numerator * forMultiplication.numerator;
        short detRes = (short) (this.denominator * forMultiplication.denominator);
        return new Fractions(numRes, detRes);
    }

    public Fractions division(Fractions forDiv) {
        long numRes = this.numerator * forDiv.denominator;
        short detRes = (short) (this.denominator * forDiv.numerator);
        return new Fractions(numRes, detRes);
    }


    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }


}



























