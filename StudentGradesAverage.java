 /**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */
 
 public class StudentGradesAverage {
    public void GetGradeAverage() {
        int[] StudentGradesArray = {50,70,100};

        int StudentGradesSum = 0;
        for(int i = 0; i < StudentGradesArray.length; i ++){
            StudentGradesSum += StudentGradesArray[i];
        }

        int StudentGradesAverage = StudentGradesSum / StudentGradesArray.length;
        System.out.println("El promedio es: " + StudentGradesAverage);
    }
}