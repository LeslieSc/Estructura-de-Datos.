/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 13-Feb-2025
 */

import java.util.ArrayList;

public class ArrayListExample {
    ArrayList<String> cars = new ArrayList<String>();

    public void addCars(String car){
        cars.add(car);

    }

    public int returnSize(){
        return cars.size();
    }

    public void removeCar(int carIndex){
        cars.remove(carIndex);    
    }
}
