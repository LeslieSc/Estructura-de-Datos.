package SecondPartial;

public class LinearSearch {
    public int find(int number){
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] == number ) {
                return index;
            }
            else{
                return -1;
            }
        }
        return 0;
    }
}
