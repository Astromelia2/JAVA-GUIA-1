package Eje6;

import javax.swing.JOptionPane;

public class Eje6 {

    public static double calcularAreaRectangulo(double b,double h) {
        return b*h;
    }
    public static double calcularAreaTriangulo(double b,double h) {
        return (b*h)/2;
    }
    public static double calcularPerimetro(double A,double B,double C) {
        return A+B+C+(calcularHipotenusa(A-C,B));
    }

    public static double calcularHipotenusa(double adyacente,double opuesto) {
        return Math.sqrt(Math.pow(opuesto,2)+Math.pow(adyacente,2));
    }

    public static void main(String[] args) {
        double A = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado A: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado B: "));
        double C = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado C: "));

        System.out.println("El Area de la Figura es: " + (calcularAreaTriangulo(A-C,B)+calcularAreaRectangulo(C,B)));
        System.out.println("El Perimetro de la Figura es: " + calcularPerimetro(A,B,C));
    }

}
