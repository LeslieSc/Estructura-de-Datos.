/**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */

public class EstructuraDeDatos {
    public static void main(String[] args) {
        // RandomElementGame objRandomElementGame = new RandomElementGame();
        // objRandomElementGame.GetRandomElement();

        // StudentGradesAverage objStudentGradesAverage = new StudentGradesAverage();
        // objStudentGradesAverage.GetGradeAverage();

        // ClassmateNameList objClassmateNameList = new ClassmateNameList();
        // objClassmateNameList.GetClassmateTotal();

        // Crear instancia de UserData y pasa aqui el apellido y el nombre

        // UserData objUserData = new UserData();

        // se declara la variable fullName del tipo String
        // se le asigna el valor de retorno de la funcion fullName
        // se le pasa como parametro el nombre y el apellido

        // String fullName = objUserData.fullName("Leslie","Sosa");
        // System.out.println(fullName);

        StudentGrades objStudentGrades = new StudentGrades();
        int partialGradeResult = objStudentGrades.calculateFirstPartialGrade(85, 90);
        System.out.println("La calificacion parcial es: " + partialGradeResult);

        int finalGradeResult = objStudentGrades.calculateFinalGrade(80, 75, 90, 85);
        System.out.println("La calificacion final es: " + finalGradeResult);

        String absencesResult = objStudentGrades.checkFailureByAbsences(64, 7);
        System.out.println(absencesResult);

    }
}
