package Eje4;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double angulo = Double.parseDouble(JOptionPane.showInputDialog("Digite el angulo: "));
        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Digite el velocidad: "));
        Proyectil proyectil = new Proyectil(Math.toRadians(angulo),velocidad);

        proyectil.alcance();
    }
}
