package Eje2;

import javax.swing.JOptionPane;

public class Eje2 {

    public static int calcularBusesNecesarios(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {

        int sillasNecesariasParaGordos = estudiantesGordos * 2;

        int sillasNecesariasParaFlacos = estudiantesFlacos;

        int totalSillasNecesarias = sillasNecesariasParaGordos + sillasNecesariasParaFlacos;

        int busesNecesarios = (int) Math.ceil((double) totalSillasNecesarias / sillasPorBus);

        return busesNecesarios;
    }

    public static void main(String[] args) {
        int sillasPorBus = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Sillas por Bus: "));
        int estudiantesGordos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Estudiantes Gordos: "));
        int estudiantesFlacos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Estudiantes Flacos: "));

        int busesNecesarios = calcularBusesNecesarios(sillasPorBus, estudiantesGordos, estudiantesFlacos);

        System.out.println("El número de buses necesarios para el paseo es: " + busesNecesarios);
    }
}
