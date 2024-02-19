package Eje5;

import javax.swing.JOptionPane;

public class Eje5 {

    public static double calcularAreaCirculo(double r) {
        return Math.PI*r*r;
    }

    public static double calcularAreaCorona(double r,double R) {
        return calcularAreaCirculo(R)-calcularAreaCirculo(r);
    }

    public static void main(String[] args) {
        double R = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio del Circulo Grande: "));
        double r = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Radio del Circulo Pequeno: "));

        System.out.println("El Area de la Corona Circular es: " + calcularAreaCorona(r,R));
    }

}
