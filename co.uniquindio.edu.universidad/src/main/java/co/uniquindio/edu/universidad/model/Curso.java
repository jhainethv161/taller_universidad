package co.uniquindio.edu.universidad.model;

public class Curso {
    private String nombre;
    private int semestre;
    private String grupo;
    private int creditos;
    private String jornada;

    public Curso(String nombre, int semestre, String grupo, int creditos, String jornada) {
        this.nombre = nombre;
        this.semestre = semestre;
        this.grupo = grupo;
        this.creditos = creditos;
        this.jornada = jornada;
    }

    private Estudiante estudiante1;
    private Estudiante estudiante2;
    private Estudiante estudiante3;
    private Docente docente;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public Estudiante getEstudiante1() {
        return estudiante1;
    }

    public void setEstudiante1(Estudiante estudiante1) {
        this.estudiante1 = estudiante1;
    }

    public Estudiante getEstudiante2() {
        return estudiante2;
    }

    public void setEstudiante2(Estudiante estudiante2) {
        this.estudiante2 = estudiante2;
    }

    public Estudiante getEstudiante3() {
        return estudiante3;
    }

    public void setEstudiante3(Estudiante estudiante3) {
        this.estudiante3 = estudiante3;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public void mostrarInformacionEstudiante(){
        String informacionEstudiante1 = getEstudiante1().obtenerInformacion();
        String informacionEstudiante2 = getEstudiante2().obtenerInformacion();
        String informacionEstudiante3 = getEstudiante3().obtenerInformacion();
        System.out.println("Informacion de Estudiante 1: "+informacionEstudiante1);
        System.out.println("Informacion de Estudiante 2: "+informacionEstudiante2);
        System.out.println("Informacion de Estudiante 3: "+informacionEstudiante3);
    }

    public double promedioNotaCurso(){
        double promedioEstudiante1 = 0.0;
        double promedioEstudiante2 = 0.0;
        double promedioEstudiante3 = 0.0;
        double promedioCurso = 0.0;
        promedioEstudiante1 = getEstudiante1().calcularMiPromedio();
        promedioEstudiante2 = getEstudiante2().calcularMiPromedio();
        promedioEstudiante3 = getEstudiante3().calcularMiPromedio();
        promedioCurso = (promedioEstudiante1+promedioEstudiante2+promedioEstudiante3)/3;
        return promedioCurso;
    }


    public double pocentajeAprobados(){
        int cantidadEstudiantes = 3;
        double promedioAprobaronCurso=0;
        double  cantidadAprobados = getDocente().calcularAprobaronCurso(getEstudiante1(), getEstudiante2(), getEstudiante3());
        promedioAprobaronCurso = (cantidadAprobados*100)/cantidadEstudiantes;
        return promedioAprobaronCurso;
    }

    public double pocentajeReprobados(){
        int cantidadEstudiantes = 3;
        double promedioReprobaronCurso=0;
        double  cantidadReprobados = getDocente().calcularReprobaronCurso(getEstudiante1(), getEstudiante2(), getEstudiante3());
        promedioReprobaronCurso = (cantidadReprobados*100)/cantidadEstudiantes;
        return promedioReprobaronCurso;
    }

    public double notaMenorCurso(){
        double notaMenor =0;
        notaMenor = getDocente().calcularNotaMenorDelCurso(getEstudiante1(), getEstudiante2(), getEstudiante3());
        return notaMenor;
    }
    public double notaMayorCurso(){
        double notaMayor =0;
        notaMayor = getDocente().calcularNotaMayorDelCurso(getEstudiante1(), getEstudiante2(), getEstudiante3());
        return notaMayor;
    }

    public double promedioEdadCurso(){
        double promedioEdadCurso = 0;
        promedioEdadCurso = getDocente().calcularPromedioEdad(getEstudiante1(), getEstudiante2(), getEstudiante3());
        return promedioEdadCurso;
    }

    public void estudiantesNotaMayor4(){
        String mensaje = "";
        if (getDocente().obtenerEstudianteNotaMayor4(getEstudiante1())){
            mensaje+="Todas las notas del estudiente "+getEstudiante1().getNombre()+"son mayores a 4.0\n";
        }
        if (getDocente().obtenerEstudianteNotaMayor4(getEstudiante2())){
            mensaje+="Todas las notas del estudiente "+getEstudiante2().getNombre()+"son mayores a 4.0\n";
        }
        if (getDocente().obtenerEstudianteNotaMayor4(getEstudiante3())){
            mensaje+="Todas las notas del estudiente "+getEstudiante3().getNombre()+"son mayores a 4.0\n";
        }

        System.out.println(mensaje);
    }

    public void notasMaximaEstudiantes(){
        double notaMaximaEstudiante1 = 0;
        double notaMaximaEstudiante2 = 0;
        double notaMaximaEstudiante3 = 0;
        notaMaximaEstudiante1=getDocente().obtenerNotaMaximaEstudiante(getEstudiante1());
        notaMaximaEstudiante2=getDocente().obtenerNotaMaximaEstudiante(getEstudiante2());
        notaMaximaEstudiante3=getDocente().obtenerNotaMaximaEstudiante(getEstudiante3());
        System.out.println("La nota maxima de "+getEstudiante1().getNombre()+" es: "+notaMaximaEstudiante1+"\n" +
                "La nota maxima de "+getEstudiante2().getNombre()+" es: "+notaMaximaEstudiante2+"\n"+
                "La nota maxima de "+getEstudiante3().getNombre()+" es: "+notaMaximaEstudiante3+"\n");

    }
}
