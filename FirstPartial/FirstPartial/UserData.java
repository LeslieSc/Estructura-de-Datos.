package FirstPartial;
/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */


public class UserData {
    public String fullName(String firstName, String lastName) {
        return String.format("El nombre completo es: %s %s ", firstName, lastName);
        //return firstName + " " + lastName; concatenacion
    }
}
