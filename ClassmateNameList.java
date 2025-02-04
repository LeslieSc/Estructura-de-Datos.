/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */



 public class ClassmateNameList {
    public void GetClassmateTotal() {
        String[] ClassmateNames = {"Rebeca","Argel","Leslie","Jorge","Rodrigo","Carlo","Cesar","Justin","Oscar","Sebastian","Mario","Sebastian","Christian","Camila"}; // Crea un array con los nombres de los alumnos.
        
        System.out.println("Classmate List:"); // imprime la lista de alumnos 
        for (int i = 0; i < ClassmateNames.length; i ++ ) {
            System.out.println(ClassmateNames[i]);
        }

        System.out.println("Classmate Total:" + ClassmateNames.length); // imprime el numero total de alumnos

    }
}
