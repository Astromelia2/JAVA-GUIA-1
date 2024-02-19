package Eje4;

import javax.swing.JOptionPane;

public class Eje4 {

    public static double calcularArriendo(double sueldo) {
        return sueldo * 0.4;
    }

    public static double calcularComida(double sueldo) {
        return sueldo * 0.15;
    }

    public static double calcularDineroRestante(double sueldo) {
        return sueldo - (calcularArriendo(sueldo) + calcularComida(sueldo));
    }

    public static void main(String[] args) {
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo: "));

        System.out.println("El gasto en arriendo de Pedro es: " + calcularArriendo(sueldo));
        System.out.println("El gasto en comida de Pedro es: " + calcularComida(sueldo));
        System.out.println("El dinero que le queda a Pedro es: " + calcularDineroRestante(sueldo));
    }

}
