package SecondPartial;

/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 6-Mar-2025
 */

public class SelectionSortExample {
    public static int selectionSort(int arr[]) {
        int n = arr.length;
        int comparisons = 0; // Contador de comparaciones
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Se asume que el mínimo está en la posición actual
            for (int j = i + 1; j < n; j++) {
                comparisons++; // Contamos comparaciones realizadas
                if (arr[j] < arr[minIndex]) {
                    minIndex = j; // Se actualiza el índice del mínimo
                }
            }
            // Se intercambia el mínimo encontrado con la posición actual
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return comparisons;
}}

