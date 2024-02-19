package Eje3;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el Año a guardar"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes a guardar"));
        if (b < 0 || b > 12) {
            System.out.println("Mes fuera de rango");
        } else {
            int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dia a guardar"));
            if (c < 0 || c > 31) {
                System.out.println("Dia fuera de rango");
            } else {
                Fecha objFecha = new Fecha(a, b, c);
                objFecha.consultarLaFecha();
            }

        }
    }
}
