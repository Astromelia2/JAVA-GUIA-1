package Eje12;

public class Eje12 {

    static String obtenerDiaSiguiente(String diaActual) {
        String[] dias = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        for (int i = 0; i < dias.length; i++) {
            if (diaActual.equalsIgnoreCase(dias[i])) {
                return dias[(i + 1) % dias.length];
            }
        }
        return "Día no válido";
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el nombre de un día: ");
        String diaActual = scanner.nextLine();

        String diaSiguiente = obtenerDiaSiguiente(diaActual);
        System.out.println("El día siguiente es: " + diaSiguiente);
    }
}
