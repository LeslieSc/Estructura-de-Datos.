import java.util.Scanner;

// Clase para calcular la calificación parcial
class GradeCalculator {
    /**
     * Calcula la calificación total considerando 70% examen y 30% tareas.
     */
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calificación del examen parcial: ");
        double examGrade = scanner.nextDouble();
        System.out.print("Ingrese la calificación de tareas: ");
        double assignmentsGrade = scanner.nextDouble();

        double finalGrade = (examGrade * 0.7) + (assignmentsGrade * 0.3);
        System.out.println("Calificación final: " + finalGrade);
    }
}