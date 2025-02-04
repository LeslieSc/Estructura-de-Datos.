/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */

 /**
 *Obtiene el total de alumnos
 *@param ClassmateNames Array de nombres de alumnos
 *@
 */

 public class ClassmateNameList {
    public void GetClassmateTotal() {
        String[] ClassmateNames = {"Rebeca","Argel","Leslie","Jorge","Rodrigo","Carlo","Cesar","Justin","Oscar","Sebastian","Mario","Sebastian","Christian","Camila"};
        
        System.out.println("Classmate List:");
        for (int i = 0; i < ClassmateNames.length; i ++ ) {
            System.out.println(ClassmateNames[i]);
        }

        System.out.println("Classmate Total:" + ClassmateNames.length);

    }
}
