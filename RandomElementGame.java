/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */

public class RandomElementGame {
    public void GetRandomElement() {
        String[] GameElementString = {"Piedra", "Papel", "Tijera"};

        int GameElementIndex = (int) (Math.random() * GameElementString.length);

        System.out.print(GameElementString[GameElementIndex]);
    }
    
}
