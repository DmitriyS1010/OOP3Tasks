import Task1.Fraction;
import Task2.Matrix;
import Task3.Figure;
import Task3.Point;

import java.sql.SQLOutput;

public class MainClass {
    public static void main(String[] args) {


        Task1();
        // Task2();
        // Task3();
    }

    private static void Task3() {


        Figure figure = new Figure(
                new Point(0, 0, "X"),
                new Point(3, 0, "Y"),
                new Point(0, 4, "Z")
        );


        System.out.println(figure.PerimeterCalculator());

        System.out.println(figure);


        Figure figure1 = new Figure(
                new Point(0, 0, "A"),
                new Point(5, 0, "B"),
                new Point(5, 5, "C"),
                new Point(0, 5, "D")
        );
        System.out.println(figure1.PerimeterCalculator());

        System.out.println(figure1);

    }


    private static void Task2() {


        Matrix matrix = new Matrix(3, 3);

        matrix.matrix[0][0] = 1;
        matrix.matrix[1][1] = 1;
        matrix.matrix[2][2] = 1;


        matrix.matrixSOUT(matrix.matrix);
        System.out.println(matrix.isIdentity());
        matrix.matrix[2][2] = 3;
        matrix.matrixSOUT(matrix.matrix);
        System.out.println(matrix.isIdentity());

        Matrix matrix1 = new Matrix(3, 3);
        matrix1.matrix[0][0] = 3;
        matrix1.matrix[1][1] = 3;
        matrix1.matrix[2][2] = 3;

        System.out.println("Первая + вторая матрица");
        Matrix matrix2 = Matrix.addMatrix(matrix, matrix1);
        matrix2.matrixSOUT(matrix2.matrix);

        System.out.println("=====");
        System.out.println("матрица А");

        Matrix matrixA = new Matrix(3, 3);
        for (int i = 0; i < matrixA.matrix.length; i++) {
            for (int j = 0; j < matrixA.matrix[0].length; j++) {

                matrixA.matrix[i][j] = (int) (Math.random() * 10);

            }
        }


        matrixA.matrixSOUT(matrixA.matrix);

        System.out.println("матрица В");


        Matrix matrixB = new Matrix(3, 3);
        for (int i = 0; i < matrixB.matrix.length; i++) {
            for (int j = 0; j < matrixB.matrix[0].length; j++) {

                matrixB.matrix[i][j] = (int) (Math.random() * 10);

            }
        }

        matrixA.matrixSOUT(matrixB.matrix);
        System.out.println("=====");
        //3AB+(A-B)A

        Matrix result = new Matrix(3, 3);
        result = Matrix.addMatrix((Matrix.multiplicationOnNumberMatrix((Matrix.multiplicationMatrix(matrixA, matrixB)), 3)), (Matrix.multiplicationMatrix(matrixA, Matrix.subtractionMatrix(matrixA, matrixB))));
        result.matrixSOUT(result.matrix);

        System.out.println("является ли А обратной В");
        System.out.println( Matrix.isReversibleMatrix(matrixA,matrixB));

    }


    public static void Task1() {
        double a1 = 2.0d;
        double a2 = 3.0d;
        double a3 = 4.0d;
        double b1 = 5.0d;
        double b2 = 6.0d;
        double b3 = 7.0d;


        Fraction fraction = new Fraction(a1, b1);
        Fraction fraction1 = new Fraction(a2, b2);
        Fraction fraction2 = new Fraction(a3, b3);


        Fraction fractionTEST = new Fraction(24, 6);

        System.out.println(Fraction.reduceFraction(fractionTEST));


        Fraction result = Fraction.multiplyFraction(Fraction.addFraction(fraction, fraction1), Fraction.addFraction(fraction, fraction2));
        System.out.println(result);
        System.out.println(Fraction.reverseFraction(result));

    }
}
