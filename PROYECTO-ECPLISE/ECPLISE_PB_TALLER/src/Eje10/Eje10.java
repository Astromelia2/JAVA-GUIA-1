package Eje10;
public class Eje10 {
    public static int operar(int a, int b, String operador) {
        switch (operador) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return b != 0 ? a / b : 0; // Evitamos la división por cero.
            case "%":
                return a % b;
            case "**":
                return (int) Math.pow(a, b);
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea después del número.
        System.out.print("Ingrese el operador (+, -, *, /, %, **): ");
        String operador = scanner.nextLine();

        int resultado = operar(numero1, numero2, operador);
        System.out.println("Resultado: " + resultado);
    }
}
