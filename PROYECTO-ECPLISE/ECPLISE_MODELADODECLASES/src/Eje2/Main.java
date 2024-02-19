package Eje2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la Hora a guardar"));
        if (a < 0 || a > 24) {
            System.out.println("Hora fuera de rango");
        } else {
            int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Minuto a guardar"));
            if (b < 0 || b > 59) {
                System.out.println("Minuto fuera de rango");
            } else {
                int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Segundo a guardar"));
                if (b < 0 || b > 59) {
                    System.out.println("Segundo fuera de rango");
                } else {
                    Reloj objReloj = new Reloj(a, b, c);
                    objReloj.consultarLaHora();
                }

            }
        }

    }

}
