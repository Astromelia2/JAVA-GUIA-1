package Eje7;

import javax.swing.JOptionPane;

public class Eje7 {

    public static double calcularDistancia(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

    public static double calcularPendiente(double x1, double x2, double y1, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

    public static void main(String[] args) {
        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese X_1: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese X_2: "));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Y_1: "));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Y_2: "));

        System.out.println("La Pendiente es: " + calcularPendiente(x1, x2, y1, y2));
        System.out.println("La Distancia es: " + calcularDistancia(x1, x2, y1, y2));
    }

}
