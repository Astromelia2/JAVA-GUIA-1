package Eje6;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private String nombre;
    private int creditosTotales;
    private int semestres;
    private String nivel; // PREGRADO o POSTGRADO
    private Facultad facultad;
    
    private List<Curso> cursos = new ArrayList<>();
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Carrera(String nombre, int creditosTotales, int semestres, String nivel, Facultad facultad, List<Curso> cursos, List<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
        this.semestres = semestres;
        this.nivel = nivel;
        this.facultad = facultad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
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

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    public void añadirCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void eliminarCurso(Curso curso) {
        this.cursos.remove(curso);
    }

    public void añadirEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void eliminarEstudiantes(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }
}