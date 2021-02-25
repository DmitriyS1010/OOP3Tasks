package Task2;

public class Matrix {

    public int[][] matrix;
    private int rows;
    private int columns;


    public Matrix(int size) {
        this.columns = size;
        this.rows = size;
        this.matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            this.matrix[i] = new int[size];
        }
    }


    public Matrix(int rows, int columns) {
        this.columns = columns;
        this.rows = rows;
        this.matrix = new int[rows][columns];
    }

    public void matrixSOUT(int[][] matrix) {


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                System.out.print(matrix[i][j] + " ");


            }

            System.out.println();
        }


    }


    public boolean isIdentity() {

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (i == j) {
                    if (matrix[i][j] != 1) return false;

                } else {

                    if (this.matrix[i][j] != 0) return false;
                }


            }

        }
        return true;
    }


    public static Matrix addMatrix(Matrix matrix, Matrix matrix1) {

        Matrix matrix2 = new Matrix(matrix.rows, matrix.columns);

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {

                matrix2.matrix[i][j] = matrix.matrix[i][j] + matrix1.matrix[i][j];

            }

        }

        return matrix2;

    }

    public static Matrix subtractionMatrix(Matrix matrix, Matrix matrix1) {

        Matrix matrix2 = new Matrix(matrix.rows, matrix.columns);

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {

                matrix2.matrix[i][j] = matrix.matrix[i][j] - matrix1.matrix[i][j];

            }

        }

        return matrix2;

    }

    public static Matrix multiplicationMatrix(Matrix matrix, Matrix matrix1) {

        Matrix matrix2 = new Matrix(matrix.rows, matrix.columns);

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {

                matrix2.matrix[i][j] = matrix.matrix[i][j] * matrix1.matrix[i][j];

            }

        }

        return matrix2;

    }

    public static Matrix multiplicationOnNumberMatrix(Matrix matrix, int number) {

        Matrix matrix2 = new Matrix(matrix.rows, matrix.columns);

        for (int i = 0; i < matrix.rows; i++) {
            for (int j = 0; j < matrix.columns; j++) {

                matrix2.matrix[i][j] = matrix.matrix[i][j] * number;

            }

        }

        return matrix2;

    }


    public static boolean isReversibleMatrix(Matrix matrix, Matrix matrix1) {

        Matrix newMatrix = new Matrix(matrix.rows, matrix.columns);

        newMatrix = Matrix.multiplicationMatrix(matrix, matrix1);

        if (newMatrix.isIdentity() == true) {

            return true;


        } else return false;


    }


    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
