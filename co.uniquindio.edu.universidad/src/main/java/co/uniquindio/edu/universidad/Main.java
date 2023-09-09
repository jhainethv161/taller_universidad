package co.uniquindio.edu.universidad;

import co.uniquindio.edu.universidad.model.Estudiante;
import co.uniquindio.edu.universidad.model.Docente;
import co.uniquindio.edu.universidad.model.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso = inicializaDatosPrueba();
        
    }
        private static Curso inicializaDatosPrueba() {
            Estudiante estudiante1 = crearEstudiante("Juan",17, "juan@mail.com", 3, 3, 3.5, 4.5);
            Estudiante estudiante2 = crearEstudiante("Maria", 15, "pepita@mail.com", 1, 2, 2.5, 4.5);
            Estudiante estudiante3 = crearEstudiante("Pepe", 20, "pepe@mail.com", 4, 4, 2.5, 4);
            Docente docente = new Docente("Oscar Salazar", 36, "oscarS@mail.com");
            Curso curso = new Curso("Programacion 1", 2, "02-N", 3, "Nocturna");
            curso.setEstudiante1(estudiante1);
            curso.setEstudiante2(estudiante2);
            curso.setEstudiante3(estudiante3);
            curso.setDocente(docente);

            return curso;
        }

        private static Estudiante crearEstudiante(String nombre, int edad, String correo, int semestre, double nota1, double nota2, double nota3){
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setEdad(edad);
        estudiante.setCorreo(correo);
        estudiante.setSemestre(semestre);
        estudiante.setNota1(nota1);
        estudiante.setNota2(nota2);
        estudiante.setNota3(nota3);

        return estudiante;
        }
    private static Estudiante crearEstudiantePorConstructor(String nombre, int edad,String correo,int semestre,double nota1, double nota2, double nota3) {
        Estudiante estudiante = new Estudiante(nombre, edad, correo, semestre, nota1, nota2, nota3);

        return estudiante;
    }
}