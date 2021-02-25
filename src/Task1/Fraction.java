package Task1;

public class Fraction {


    private double numerator;
    private double denominator;


    public Fraction(double numerator, double denominator) {

        this.denominator = denominator;
        this.numerator = numerator;


    }

    public Fraction() {

        this.numerator = 0;
        this.denominator = 1;
    }

    public static Fraction reverseFraction(Fraction fraction) {
        if (fraction.numerator != 0) {

            return new Fraction(fraction.denominator, fraction.numerator);

        } else return new Fraction(fraction.denominator, 1);


    }

    public static Fraction reverseFraction(double numerator, double denominator) {

        if (numerator != 0) {
            return new Fraction(denominator, numerator);

        } else return new Fraction(denominator, 1);


    }

    public static Fraction addFraction(Fraction fraction, Fraction fraction1) {

        Fraction newFraction = new Fraction((fraction.getNumerator() * fraction1.getDenominator() + fraction1.getNumerator() * fraction.getDenominator()), (fraction.getDenominator() * fraction1.getDenominator()));


        //System.out.println("Результат сложения первой дроби: " + fraction + " и второй дроби; " + fraction1 + " будет равен дроби = " + "\n" + newFraction);
        return Fraction.reduceFraction(newFraction);
    }

    public static Fraction subtractionFraction(Fraction fraction, Fraction fraction1) {

        Fraction newFraction = new Fraction((fraction.getNumerator() * fraction1.getDenominator() - fraction1.getNumerator() * fraction.getDenominator()), (fraction.getDenominator() * fraction1.getDenominator()));


        //  System.out.println("Результат вычитания второй дроби: " + fraction1 + " из первой дроби; " + fraction + " будет равен дроби = " + "\n" + newFraction);
        return Fraction.reduceFraction(newFraction);
    }

    public static Fraction  multiplyFraction(Fraction fraction, Fraction fraction1) {

        Fraction newFraction = new Fraction((fraction.getNumerator() * fraction1.getNumerator()), (fraction.getDenominator() * fraction1.getDenominator()));


        //   System.out.println("Результат умножения первой дроби: " + fraction + " и второй дроби; " + fraction1 + " будет равен дроби = " + "\n" + newFraction);
        return Fraction.reduceFraction(newFraction);
    }


    public static Fraction reduceFraction(Fraction fraction) {



        double a = Math.min(fraction.getNumerator(), fraction.getDenominator());



        for (int i = (int)a; i > 2; i--) {


            if (fraction.getNumerator() % i == 0 && fraction.getDenominator() % i == 0) {

                Fraction newFr = new Fraction(fraction.getNumerator() / i, (fraction.getDenominator() / i));


                return newFr;


            }

        }

        return fraction;
    }


    @Override
    public String toString() {
        return "Дробь [" +
                "Числитель = " + numerator +
                ",знаменатель = " + denominator +
                ']';
    }


    public double getNumerator() {
        return numerator;
    }

    public void setNumerator(double numerator) {
        this.numerator = numerator;
    }

    public double getDenominator() {
        return denominator;
    }


    public void setDenominator(double denominator) {

        this.denominator = denominator;
    }


}