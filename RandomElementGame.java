/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */

/**
 * Se define la clase RandomElementGame
 * Se crea un metodo GetRandomElement
 * Se define un arreglo con tres opciones: "Piedra", "Papel" y "Tijera"
 * Generamos un indice aleatorio:
 * * Math.random() genera un numero entre 0 y 1 
 * * Se multiplica por GameElementString.length (que es 3 en este caso)
 * * Se convierte el resultado a un entero(int), lo que da un numero aleatorio 0,1 o 2 
 * Se usa System.out.print para mostrar el valor correspondiente al indice aleatorio generado
 */

public class RandomElementGame {
    public void GetRandomElement() {
        String[] GameElementString = {"Piedra", "Papel", "Tijera"};

        int GameElementIndex = (int) (Math.random() * GameElementString.length);

        System.out.print(GameElementString[GameElementIndex]);
    }
    
}
