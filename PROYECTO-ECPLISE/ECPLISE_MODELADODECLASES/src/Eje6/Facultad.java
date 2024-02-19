package Eje6;

import java.util.ArrayList;
import java.util.List;
// Clase Facultad

public class Facultad {

    private String nombre;
    private String codigo;
    // Cada facultad tiene múltiples carreras
    private List<Carrera> carreras = new ArrayList<>();
    // Cada facultad tiene múltiples profesores
    private List<Profesor> profesores = new ArrayList<>();

    public Facultad(String nombre, String codigo, List<Carrera> carreras, List<Profesor> profesores) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    public void anadirCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void eliminarCarrera(Carrera carrera) {
        this.carreras.remove(carrera);
    }

    public void anadirProfesor(Profesor profesor) {
        this.profesores.add(profesor);
    }

    public void eliminarProfesor(Profesor profesor) {
        this.profesores.remove(profesor);
    }

}
