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
        if (absencePercentage < 10) {
            return "Alumno cumple con las asistencias minimas.";
        } else {
            return "Alumno no cumple con las asistencias minimas.";
        }
    }
}