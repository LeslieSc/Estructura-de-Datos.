public class StudentGrades {
    public int calculateFirstPartialGrade(int examScore, int homeworkScore) {

        double firstPartialGrade = ((examScore * 0.7) + (homeworkScore * 0.3) );
        return(int)(firstPartialGrade);
        
    }
    
    public int calculateFinalGrade(int firstPartialScore, int secondParitalScore, int thirdPartialScore, int finalExamScore) {

    }

    public String checkFailureByAbsences(int totalHours, int totalAbsences) {

    }
}
