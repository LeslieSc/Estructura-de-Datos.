public class ExerciseNumberType {
    public void getNumberType() {
        int[] numberArray = {
            0, 2, 5, 8, 11, 14, 17, 20, 23, 26, 
            29, 32, 35, 38, 41, 44, 47, 50, 53, 56, 
            59, 62, 65, 68, 71, 74, 77, 80, 83, 86, 
            89, 92, 95, 98, 0, 3, 6, 9, 12, 15, 
            18, 21, 24, 27, 30, 33, 36, 39, 42, 45
        };

        int evenNumbers = 0;
        int oddNumbers = 0;
        int zeros = 0;

        for (int number : numberArray){
            if (number == 0) {
                zeros++;
            } else if (number % 2 == 0){
                evenNumbers++;
            } else {
                oddNumbers++;
            }
        }

        System.out.println("Total de numeros pares: " + evenNumbers);
        System.out.println("Total de numeros nones:" + oddNumbers);
        System.out.println("Total de ceros: " + zeros);
    }
}
