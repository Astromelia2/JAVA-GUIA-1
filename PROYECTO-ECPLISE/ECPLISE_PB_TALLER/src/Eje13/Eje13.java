package Eje13;
public class Eje13 {
    static double calcularAumento(double sueldo) {
        if (sueldo <= 800000) {
            return sueldo * 0.10;
        } else if (sueldo <= 1200000) {
            return sueldo * 0.08;
        } else {
            return sueldo * 0.05;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el sueldo actual del empleado: ");
        double sueldoActual = scanner.nextDouble();

        double aumento = calcularAumento(sueldoActual);
        double nuevoSueldo = sueldoActual + aumento;

        System.out.println("El aumento es: " + aumento);
        System.out.println("El nuevo sueldo es: " + nuevoSueldo);
    }
}

