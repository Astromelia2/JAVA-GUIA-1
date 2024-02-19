package Eje1;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el numerador"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el denominarior"));
        Fraccionario objFraccionario = new Fraccionario(a, b);
        objFraccionario.division();
    }

}
