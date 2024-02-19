package Eje6;

import java.util.ArrayList;
import java.util.List;
// Clase Universidad

public class Universidad {

    private String nombre;
    private String nombreRector;
    private String ciudad;
    // Suponiendo que cada universidad tiene múltiples facultades
    private List<Facultad> facultades = new ArrayList<>();

    // Constructor, getters y setters
    
    public Universidad(String nombre, String nombreRector, String ciudad, List<Facultad> facultades) {
        this.nombre = nombre;
        this.nombreRector = nombreRector;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreRector() {
        return nombreRector;
    }

    public void setNombreRector(String nombreRector) {
        this.nombreRector = nombreRector;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Facultad> getFacultades() {
        return facultades;
    }

    public void setFacultades(List<Facultad> facultades) {
        this.facultades = facultades;
    }

    public void anadirFacultad(Facultad facultad) {
        this.facultades.add(facultad);
    }

    public void eliminarFacultad(Facultad facultad) {
        this.facultades.remove(facultad);
    }
}
