 /**
 * Autor: Leslie Anahi Sosa Corral
 * Matrícula: 15248
 * Fecha: 04-Feb-2025
 */
 
 /**
  * Se crea la clase StudentGradesAverage
  * Se crea el metodo GetGradeAverage
  * Se crea un arreglo StudentGradesArray que contiene tres calificaciones
  * Se inicializa una variable StudentGradesSum en 0, que servira para contener la suma de todas las calificaciones
  * Bucle para calcular la suma:
  ** Se recorre el arreglo con un ciclo for
  ** i comienza en 0 y avanza hasta StudentGradesArray (es decir, hasta 2)
  ** En cada iteracion, se suma el valor de StudentGradesArray[i] a StudentGradesSum
  ** Despues de este bucle, StudentGradesSum tendra el valor de la suma de todas las calificaciones
  * Se calcula el promedio dividiendo la suma total de calificaciones(StudentGradesSum) entre la cantidad de elementos en el arreglo(StudentGradesArray.length)
  * Se muestra en la consola el promedio calculado
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