package Eje11;
public class Eje11 {
    // Función para obtener la cifra de las decenas
    static int obtenerDecenas(int numero) {
        return numero / 10;
    }

    // Función para obtener la cifra de las unidades
    static int obtenerUnidades(int numero) {
        return numero % 10;
    }

    // Función para convertir un dígito a romano (unidades)
    static String convertirUnidadesARomano(int unidad) {
        String[] romanos = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return romanos[unidad];
    }

    // Función para convertir un dígito a romano (decenas)
    static String convertirDecenasARomano(int decena) {
        String[] romanos = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        return romanos[decena];
    }

    // Programa principal que utiliza las funciones anteriores
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 99: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 99) {
            System.out.println("Número fuera del rango. Por favor, ingrese un número entre 1 y 99.");
        } else {
            int decenas = obtenerDecenas(numero);
            int unidades = obtenerUnidades(numero);
            String numeroRomano = convertirDecenasARomano(decenas) + convertirUnidadesARomano(unidades);
            System.out.println("Número romano: " + numeroRomano);
        }
    }
}

