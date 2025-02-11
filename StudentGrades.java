/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 11-Feb-2025
 */

/**
 * Se define la clase StudentGrades
 * Metodo calculateFirstPartialGrade: 
 * recibe dos parametros enteros 
 * se calcula la calificacion final 
 * se convierte el resultado a un entero 
 * retorna la calificacion como un entero
 * Metodo calculateFinalGrade: 
 * Recibe cuatro calificaciones enteras
 * se obtiene la calificacion final 
 * se convierte el resultado a entero 
 * se retorna la calificacion final como entero.
 * Metodo checkFailureByAbsences: 
 * Recibe dos enteros 
 * se calcula el porcentaje de faltas (se usa double para asegurar que la division sea decimal y evitar errores de precision)
 * Si el porcentaje de faltas es menor al 10% retorna un mensaje negativo
 * Si el porcentaje es 10% o mas retorna un mensaje positivo 
 */

public class StudentGrades {
    public int calculateFirstPartialGrade(int examScore, int homeworkScore) {

        double firstPartialGrade = ((examScore * 0.7) + (homeworkScore * 0.3));
        return (int) (firstPartialGrade);

    }

    public int calculateFinalGrade(int firstPartial, int secondPartial, int thirdPartial, int finalExam) {

        double finalGrade = (((firstPartial + secondPartial + thirdPartial) / 3) * 0.5) + (finalExam * 0.5);
        return (int) (finalGrade);

    }

    public String checkFailureByAbsences(int totalHours, int totalAbsences) {

        double absencePercentage = ((((double) totalAbsences / (double) totalHours)) * 100);
        System.out.println(absencePercentage);

        if (absencePercentage < 10) {
            return "Alumno cumple con las asistencias minimas.";
        } else {
            return "Alumno no cumple con las asistencias minimas.";
        }
    }
}