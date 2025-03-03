package SecondPartial;

public class InsertionSort2 {
        public static int insertionSort(int arr[]) {
            int n = arr.length;
            int operations = 0;
            for (int i = 1; i < n; i++) {
                int key = arr[i];
                int j = i - 1;
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                    operations++;
                }
                arr[j + 1] = key;
                operations++;
            }
            return operations;
        }
        
        public static void main(String args[]) {
            int peorCaso[] = {5, 4, 3, 2, 1};
            int mejorCaso[] = {1, 2, 3, 4, 5};
            
            System.out.println("Peor Caso:");
            int operacionesPeor = insertionSort(peorCaso);
            for (int num : peorCaso) {
                System.out.print(num + " ");
            }
            System.out.println("\nOperaciones realizadas: " + operacionesPeor);
            
            System.out.println("\nMejor Caso:");
            int operacionesMejor = insertionSort(mejorCaso);
            for (int num : mejorCaso) {
                System.out.print(num + " ");
            }
            System.out.println("\nOperaciones realizadas: " + operacionesMejor);
        }
    }
