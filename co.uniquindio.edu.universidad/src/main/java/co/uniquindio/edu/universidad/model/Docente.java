package co.uniquindio.edu.universidad.model;

public class Docente {
    private String nombre;
    private int edad;
    private String correo;

    public Docente(){

    }
    public Docente(String nombre, int edad, String correo){
        this.nombre = nombre;
        this.edad=edad;
        this.correo = correo;
    }

    private double calcularDefinitivaEstudiante(Estudiante estudiante) {

        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();
        int cantidadNotas = 3;

        double resultado = (nota1 + nota2 + nota3) / cantidadNotas;

        return resultado;
    }

    public void mostrarDefinitivaEstudiantes(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        String mensaje = "La nota definitiva de " + estudiante1.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante1) + "\n";
        mensaje += "La nota definitiva de " + estudiante2.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante2) + "\n";
        mensaje += "La nota definitiva de " + estudiante3.getNombre() + " es: " + calcularDefinitivaEstudiante(estudiante3) + "\n";

        System.out.println(mensaje);
    }

    public void mostrarPromedioCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double promedioEstudiante1 = calcularDefinitivaEstudiante(estudiante1);
        double promedioEstudiante2 = calcularDefinitivaEstudiante(estudiante2);
        double promedioEstudiante3 = calcularDefinitivaEstudiante(estudiante3);
        int cantidadPromedioEstudiantes = 3;

        double resultado = (promedioEstudiante1 + promedioEstudiante2 + promedioEstudiante3) / cantidadPromedioEstudiantes;

        System.out.println("El promedio del Curso es: " + resultado);
    }

    public int calcularPromedioEdad(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        int edadEstudiante1 = estudiante1.getEdad();
        int edadEstudiante2 = estudiante2.getEdad();
        int edadEstudiante3 = estudiante3.getEdad();
        int cantidadEdades = 3;

        int resultado = (edadEstudiante1 + edadEstudiante2 + edadEstudiante3) / cantidadEdades;

        return resultado;
    }

    public double calcularPromedioNota1(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota1Estudiante3 = estudiante3.getNota1();
        double numNotas = 3;

        double resultado = (nota1Estudiante1 + nota1Estudiante2 + nota1Estudiante3) / numNotas;

        return resultado;
    }

    public double calcularNotaMayorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota2Estudiante1 = estudiante1.getNota2();
        double nota3Estudiante1 = estudiante1.getNota3();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota2Estudiante2 = estudiante2.getNota2();
        double nota3Estudiante2 = estudiante2.getNota3();
        double nota1Estudiante3 = estudiante3.getNota1();
        double nota2Estudiante3 = estudiante3.getNota2();
        double nota3Estudiante3 = estudiante3.getNota3();

        double notaMayor = nota1Estudiante1;

        if (nota1Estudiante1 > notaMayor) {
            notaMayor = nota1Estudiante1;
        }
        if (nota2Estudiante1 > notaMayor) {
            notaMayor = nota2Estudiante1;
        }
        if (nota3Estudiante1 > notaMayor) {
            notaMayor = nota3Estudiante1;
        }
        if (nota1Estudiante2 > notaMayor) {
            notaMayor = nota1Estudiante2;
        }
        if (nota2Estudiante2 > notaMayor) {
            notaMayor = nota2Estudiante2;
        }
        if (nota3Estudiante2 > notaMayor) {
            notaMayor = nota3Estudiante2;
        }
        if (nota1Estudiante3 > notaMayor) {
            notaMayor = nota1Estudiante3;
        }
        if (nota2Estudiante3 > notaMayor) {
            notaMayor = nota2Estudiante3;
        }
        if (nota3Estudiante3 > notaMayor) {
            notaMayor = nota3Estudiante3;
        }
        return notaMayor;

    }

    public double calcularNotaMenorDelCurso(Estudiante estudiante1, Estudiante estudiante2, Estudiante estudiante3) {

        double nota1Estudiante1 = estudiante1.getNota1();
        double nota2Estudiante1 = estudiante1.getNota2();
        double nota3Estudiante1 = estudiante1.getNota3();
        double nota1Estudiante2 = estudiante2.getNota1();
        double nota2Estudiante2 = estudiante2.getNota2();
        double nota3Estudiante2 = estudiante2.getNota3();
        double nota1Estudiante3 = estudiante3.getNota1();
        double nota2Estudiante3 = estudiante3.getNota2();
        double nota3Estudiante3 = estudiante3.getNota3();

        double notaMenor = nota1Estudiante1;

        if (nota1Estudiante1 < notaMenor) {
            notaMenor = nota1Estudiante1;
        }
        if (nota2Estudiante1 < notaMenor) {
            notaMenor = nota2Estudiante1;
        }
        if (nota3Estudiante1 < notaMenor) {
            notaMenor = nota3Estudiante1;
        }
        if (nota1Estudiante2 < notaMenor) {
            notaMenor = nota1Estudiante2;
        }
        if (nota2Estudiante2 < notaMenor) {
            notaMenor = nota2Estudiante2;
        }
        if (nota3Estudiante2 < notaMenor) {
            notaMenor = nota3Estudiante2;
        }
        if (nota1Estudiante3 < notaMenor) {
            notaMenor = nota1Estudiante3;
        }
        if (nota2Estudiante3 < notaMenor) {
            notaMenor = nota2Estudiante3;
        }
        if (nota3Estudiante3 < notaMenor) {
            notaMenor = nota3Estudiante3;
        }
        return notaMenor;
    }
    public boolean verificarAprobacionCurso(Estudiante estudiante){
        boolean aprobarCurso = false;
        double notaMinima = 3.0;

        double resultado = calcularDefinitivaEstudiante(estudiante);

        if (resultado >= notaMinima){

            aprobarCurso = true;
        }
        return aprobarCurso;
    }
    public double calcularAprobaronCurso(Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){
        double estudiantesAprobados = 0;
        if (verificarAprobacionCurso(estudiante1)){
            estudiantesAprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante2)){
            estudiantesAprobados += 1;
        }
        if (verificarAprobacionCurso(estudiante3)){
            estudiantesAprobados += 1;
        }
        return estudiantesAprobados;
    }
    public double calcularReprobaronCurso(Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3){

        double estudiantesReprobados = 0;

        if (!verificarAprobacionCurso(estudiante1)){
            estudiantesReprobados += 1;
        }
        if (!verificarAprobacionCurso(estudiante2)){
            estudiantesReprobados += 1;
        }
        if (!verificarAprobacionCurso(estudiante3)){
            estudiantesReprobados+= 1;
        }

        return estudiantesReprobados;
    }
    public boolean obtenerEstudianteNotaMayor4(Estudiante estudiante){
        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();
        double notaRequerida = 4.0;

        boolean notasMayor4 = false;

        if (nota1 >= notaRequerida && nota2 >= notaRequerida && nota3 >= notaRequerida){

            notasMayor4 = true;
        }
        return notasMayor4;
    }
    public double obtenerNotaMaximaEstudiante(Estudiante estudiante){

        double nota1 = estudiante.getNota1();
        double nota2 = estudiante.getNota2();
        double nota3 = estudiante.getNota3();

        double notaMayor = 0;

        if (nota1 > notaMayor){
            notaMayor = nota1;
        }
        if (nota2 > notaMayor){
            notaMayor = nota2;
        }
        if (nota3 > notaMayor){
            notaMayor = nota3;
        }
        return notaMayor;
    }
}
