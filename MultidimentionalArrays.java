/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 17-Feb-2025
 */


public class MultidimentionalArrays {
    /*
     * Un arreglo multidimensional es un arreglo que contiene otros arreglos como
     * elementos. El mas comun es el arreglo bidimensional (matriz).
     */

     public void printBidimensionalArray() {
        //Forma de inicializar un arreglo bidimensional o matriz 
        int[][] matrix = {
            {1,2}, // [0][0] = 1 [0][1] = 2
            {3,4} // [1][0] = 3 [1][1] = 4
        };

        //Recorrer e imprimir la matriz
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Longitud de la fila " + matrix[i].length);
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }

            System.out.println();
        }
     }
}   

