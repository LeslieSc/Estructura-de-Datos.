public class StudentGradesCounter {
     /**
     * Cuenta cuántos alumnos han aprobado y cuántos han reprobado.
     */
    public void execute() {
        int[] grades = {85, 90, 45, 60, 72, 88, 50, 69, 100, 95};
        int passedStudents = 0, failedStudents = 0;

        for (int grade : grades) {
            if (grade >= 70) {
                passedStudents++;
            } else {
                failedStudents++;
            }
        }

        System.out.println("Alumnos aprobados: " + passedStudents);
        System.out.println("Alumnos reprobados: " + failedStudents);
    }
}
