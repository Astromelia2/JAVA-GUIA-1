package Eje8;

public class Eje8 {

    public static int calcularNumeroDeSalones(int numeroDeEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numeroDeEstudiantes / capacidadSalon);
    }

    static int calcularNumeroDePisos(int numeroDeSalones, int salonesPorPiso) {
        return (int) Math.ceil((double) numeroDeSalones / salonesPorPiso);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = scanner.nextInt();
        System.out.print("Ingrese la capacidad de un salón: ");
        int capacidad = scanner.nextInt();
        System.out.print("Ingrese el número de salones por piso: ");
        int salonesPorPiso = scanner.nextInt();

        int totalSalones = calcularNumeroDeSalones(estudiantes, capacidad);
        int totalPisos = calcularNumeroDePisos(totalSalones, salonesPorPiso);

        System.out.println("Total de salones necesarios: " + totalSalones);
        System.out.println("Total de pisos necesarios: " + totalPisos);
    }
}
