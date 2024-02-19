package Eje1;

import javax.swing.JOptionPane;

public class Eje1 {

    public static void main(String[] args) {

        double x = Double.parseDouble(JOptionPane.showInputDialog("Ingrese X: "));
        double y = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Y: "));

        System.out.println(miFuncion(x, y));

    }

    public static double miFuncion(double x, double y) {
        return (x * x + 2 * x * y + y * y);
    }
}
