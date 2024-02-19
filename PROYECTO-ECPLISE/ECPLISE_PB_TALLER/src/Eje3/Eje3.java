package Eje3;

import javax.swing.JOptionPane;

public class Eje3 {

    public static double calcularLongitud(double x, double teta) {
        return x / Math.sin(teta);
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura X: "));
        double teta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo de la Escalera: "));

        System.out.println("La longitud de la escalera es: "+ calcularLongitud(x, Math.toRadians(teta)));
    }

}
