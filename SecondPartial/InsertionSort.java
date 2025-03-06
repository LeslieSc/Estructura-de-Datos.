package SecondPartial;

public class InsertionSort {
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
    }