package Eje6;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nombre;
    private int codigo;
    private int creditos;
    private String salon;
    private String edificio;
    private Carrera carrera;
    // Un curso puede tener uno o más profesores
    private List<Profesor> profesores = new ArrayList<>();
    private List<Estudiante> estudiantes = new ArrayList<>();

    public Curso(String nombre, int codigo, int creditos, String salon, String edificio, Carrera carrera) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.salon = salon;
        this.edificio = edificio;
        this.carrera = carrera;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getEdificio() {
        return edificio;
    }

    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void anadirEstudiantes(Estudiante estudiante) {
        this.estudiantes.add(estudiante);
    }

    public void eliminarEstudiantes(Estudiante estudiante) {
        this.estudiantes.remove(estudiante);
    }

    public void anadirProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        this.profesores.remove(profesor);
    }
}
