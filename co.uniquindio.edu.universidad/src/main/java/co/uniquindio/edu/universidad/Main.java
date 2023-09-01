package co.uniquindio.edu.universidad;
import co.uniquindio.edu.universidad.model.Estudiante;
import co.uniquindio.edu.universidad.model.Docente;
public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = crearEstudiante("Juan", 17, "juan@mail.com", 3, 3, 3.5, 4.5);
        Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
        Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4,4,2.5,4);
        Docente docenteOscar = new Docente("Oscar Salazar", 36, "oscarS@mail.com");

        docenteOscar.mostrarDefinitivaEstudiantes(estudiante1, estudiante2, estudiante3);

        docenteOscar.mostrarPromedioCurso(estudiante1, estudiante2, estudiante3);

        System.out.println("El promedio de edad de los tres estudiantes es: " + docenteOscar.calcularPromedioEdad(estudiante1, estudiante2, estudiante3));

        System.out.println("El promedio de la nota 1 de los tres estudiantes es: " + docenteOscar.calcularPromedioNota1(estudiante1, estudiante2, estudiante3));

        System.out.println("La nota mayor del curso es: " + docenteOscar.calcularNotaMayorDelCurso(estudiante1, estudiante2, estudiante3));

        System.out.println("La nota menor del curso es: " + docenteOscar.calcularNotaMenorDelCurso(estudiante1, estudiante2, estudiante3));

        if (docenteOscar.verificarAprobacionCurso(estudiante1)){
            System.out.println("El Estudiante " + estudiante1.getNombre() + " aprobo el curso");
        }
        if (docenteOscar.verificarAprobacionCurso(estudiante2)){
            System.out.println("El Estudiante " + estudiante2.getNombre() + " aprobo el curso");
        }
        if (docenteOscar.verificarAprobacionCurso(estudiante3)){
            System.out.println("El Estudiante " + estudiante3.getNombre() + " aprobo el curso");
        }

        System.out.println("El porcentaje de estudiantes que aprobaron el curso es: "+ docenteOscar.calcularAprobaronCurso(estudiante1,estudiante2,estudiante3)+"%");

        System.out.println("El porcentaje de estudiantes que reprobaron el curso es: "+ docenteOscar.calcularReprobaronCurso(estudiante1,estudiante2,estudiante3)+"%");

        if (docenteOscar.obtenerEstudianteNotaMayor4(estudiante1)){
            System.out.print("Todas las notas de: " + estudiante1.getNombre() + "son mayores a 4.0");
        }
        if (docenteOscar.obtenerEstudianteNotaMayor4(estudiante2)){
            System.out.print("Todas las notas de: " + estudiante2.getNombre() + "son mayores a 4.0");
        }
        if (docenteOscar.obtenerEstudianteNotaMayor4(estudiante3)){
            System.out.print("Todas las notas de: " + estudiante3.getNombre() + "son mayores a 4.0");
        }
        System.out.println("La nota mayor de  " +estudiante1.getNombre() + " es: " + docenteOscar.obtenerNotaMaximaEstudiante(estudiante1));
        System.out.println("La nota mayor de  " +estudiante2.getNombre() + " es: " + docenteOscar.obtenerNotaMaximaEstudiante(estudiante2));
        System.out.println("La nota mayor de  " +estudiante3.getNombre() + " es: " + docenteOscar.obtenerNotaMaximaEstudiante(estudiante3));

    }

    private static Estudiante crearEstudiante(String nombre, int edad,String correo,int semestre,double nota1, double nota2, double nota3) {
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);
        return estudiante;
    }
}