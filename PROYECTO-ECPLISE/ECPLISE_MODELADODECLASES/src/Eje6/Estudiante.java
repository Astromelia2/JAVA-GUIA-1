package Eje6;

import java.util.ArrayList;
import java.util.List;

public class Estudiante extends Persona {

    private String colegio;
    private String fechaIngreso;
    // Un estudiante puede pertenecer a una o más carreras
    private List<Carrera> carreras = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Estudiante(String colegio, String fechaIngreso, List<Carrera> carreras, List<Curso> cursos, String cedula, String nombre, String fechaNacimiento, String lugarNacimiento) {
        super(cedula, nombre, fechaNacimiento, lugarNacimiento);
        this.colegio = colegio;
        this.fechaIngreso = fechaIngreso;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public List<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(List<Carrera> carreras) {
        this.carreras = carreras;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public void anadirCurso(Curso curso) {
        this.cursos.add(curso);
    }

    public void eliminarCurso(Curso curso) {
        this.cursos.remove(curso);
    }
    public void anadirCarrera(Carrera carrera) {
        this.carreras.add(carrera);
    }

    public void eliminarCarrera(Carrera carrera) {
        this.carreras.remove(carrera);
    }

}
