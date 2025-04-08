package SecondPartial;
/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 6-Mar-2025
 */

public class InsertionSortExample {
    public static int insertionSort(int arr[]) {
        int n = arr.length;
        int operations = 0; // Contador de operaciones
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Se toma el valor actual
            int j = i - 1;
            // Se desplazan los elementos mayores para insertar en la posición correcta
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
                operations++;
            }
            arr[j + 1] = key; // Se inserta el valor en su posición correcta
        }
        return operations;
    }
}
