package SecondPartial;

/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 6-Mar-2025
 */

public class BubbleSortExample{
    public static int bubbleSort(int[] arr) {
        int n = arr.length;
        int comparisons = 0;
        boolean swapped; // Bandera para detectar si hubo intercambios
    
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reiniciamos la bandera en cada iteración
            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++; // Contamos la comparación
                if (arr[j] > arr[j + 1]) {
                    // Intercambio de elementos
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true; // Marcamos que hubo intercambio
                }
            }
            // Si no hubo intercambios, significa que el arreglo ya está ordenado
            if (!swapped) {
                break; // Salimos del bucle
            }
        }
        return comparisons;
    }
}