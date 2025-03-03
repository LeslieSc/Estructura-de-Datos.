// Clase para la suma de valores en un arreglo bidimensional
class MatrixSumCalculator {
    /**
     * Suma los valores de un arreglo 3x3.
     */
    public void execute() {
        double[][] matrix = {
            {1.2, 2.3, 3.4},
            {4.5, 5.6, 6.7},
            {7.8, 8.9, 9.0}
        };
        double totalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                totalSum += matrix[i][j];
            }
        }

        System.out.println("Suma total de la matriz: " + totalSum);
    }
}