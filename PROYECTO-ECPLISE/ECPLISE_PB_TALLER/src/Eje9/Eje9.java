package Eje9;

public class Eje9 {
    static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int mayor = mayor(numero1, numero2);
        System.out.println("El mayor es: " + mayor);
    }
}
