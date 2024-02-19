package Eje6;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona {
    
    private String nacionalidad;
    private String profesion;
    private double sueldo;
    // Un profesor pertenece a una sola facultad
    private Facultad facultad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String nacionalidad, String profesion, double sueldo, Facultad facultad, List<Curso> cursos, String cedula, String nombre, String fechaNacimiento, String lugarNacimiento) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.nacionalidad = nacionalidad;
        this.profesion = profesion;
        this.sueldo = sueldo;
        this.facultad = facultad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
    public void añadirCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void eliminarCurso(Curso curso) {
        this.cursos.remove(curso);
    }
}