package Eje6;

import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(JOptionPane.showInputDialog("Ingrese el Colegio"), JOptionPane.showInputDialog("Ingrese la fecha de ingreso"), new ArrayList<>(), new ArrayList<>(), JOptionPane.showInputDialog("Ingrese la cedula")
                , JOptionPane.showInputDialog("Ingrese el nombre"), JOptionPane.showInputDialog("Ingrese la fecha de nacimiento"), JOptionPane.showInputDialog("Ingrese el lugar de nacimiento"));

        // Crear profesores
        Profesor profesor1 = new Profesor("Colombiana", "Matematicas", 5000.0, null, new ArrayList<>(), "1122334455", "Carlos Lopez", "1975-04-30", "Medellin, Antioquia, Colombia");
        Profesor profesor2 = new Profesor("Argentino", "Literatura", 4500.0, null, new ArrayList<>(), "5544332211", "Marta Fernandez", "1980-11-22", "Buenos Aires, Argentina");

        // Crear facultades y universidad
        Facultad facultad1 = new Facultad("Ingenieria", "F01", new ArrayList<>(), new ArrayList<>());
        Facultad facultad2 = new Facultad("Humanidades", "F02", new ArrayList<>(), new ArrayList<>());
        Universidad universidad = new Universidad("Universidad Distrital", "Dr. Sarmiento", "Bogota", new ArrayList<>(Arrays.asList(facultad1, facultad2)));
        // Asignar facultades a Universidad
        universidad.anadirFacultad(facultad1);
        universidad.anadirFacultad(facultad2);
        // Asignar profesores a facultades
        profesor1.setFacultad(facultad1);
        profesor2.setFacultad(facultad2);
        facultad1.anadirProfesor(profesor1);
        facultad2.anadirProfesor(profesor2);

        // Crear carreras
        Carrera carrera1 = new Carrera("Ingenieria de Sistemas", 150, 10, "PREGRADO", facultad1, new ArrayList<>(), new ArrayList<>());
        Carrera carrera2 = new Carrera("Filosofia", 120, 8, "PREGRADO", facultad2, new ArrayList<>(), new ArrayList<>());

        // Añadir carreras a facultades
        facultad1.anadirCarrera(carrera1);
        facultad2.anadirCarrera(carrera2);

        // Crear cursos
        Curso curso1 = new Curso("Calculo Diferencial", 101, 4, "101A", "Edificio Ciencias", carrera1);
        Curso curso2 = new Curso("Literatura Universal", 201, 3, "201B", "Edificio Humanidades", carrera2);

        // Añadir cursos a carreras
        carrera1.añadirCurso(curso1);
        carrera2.añadirCurso(curso2);

        // Asignar estudiantes y profesores a cursos
        curso1.anadirEstudiantes(estudiante1);
        curso1.anadirProfesor(profesor1);
        curso2.anadirProfesor(profesor2);

        // Establecer relaciones entre estudiantes y carreras
        estudiante1.anadirCarrera(carrera1);

        // Establecer relaciones entre estudiantes y cursos
        estudiante1.anadirCurso(curso1);

// Imprimir información para verificar la estructura creada
        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Rector: " + universidad.getNombreRector());
        System.out.println("Ciudad: " + universidad.getCiudad());

// Recorrer las facultades de la universidad
        for (Facultad f : universidad.getFacultades()) {
            System.out.println("Facultad: " + f.getNombre() + " Codigo: " + f.getCodigo());
            // Recorrer las carreras de la facultad
            for (Carrera c : f.getCarreras()) {
                System.out.println("  Carrera: " + c.getNombre() + " Creditos Totales: " + c.getCreditosTotales() + " Semestres: " + c.getSemestres());
                // Recorrer los cursos de la carrera
                for (Curso cu : c.getCursos()) {
                    System.out.println("    Curso: " + cu.getNombre() + " Codigo: " + cu.getCodigo() + " Creditos: " + cu.getCreditos());
                    // Recorrer los profesores del curso
                    for (Profesor p : cu.getProfesores()) {
                        System.out.println("      Profesor: " + p.getNombre() + " Profesion: " + p.getProfesion());
                    }
                    // Recorrer los estudiantes del curso
                    for (Estudiante e : cu.getEstudiantes()) {
                        System.out.println("      Estudiante: " + e.getNombre() + " Cedula: " + e.getCedula());
                    }
                }
            }
        }

    }
}
