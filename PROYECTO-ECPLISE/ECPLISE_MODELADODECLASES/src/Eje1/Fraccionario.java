package Eje1;

public class Fraccionario {

     private double numerador;
     private double denominador;
     private double cociente;

    public Fraccionario(double a, double b) {
        this.numerador = a;
        this.denominador = b;
    }

    public void division() {
        if (denominador == 0) {
            System.out.println("Division por cero");
        } else {
            cociente = numerador / denominador;
        }
        System.out.println("La solucion de la division es: " + cociente);
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double getCociente() {
        return cociente;
    }

    public void setCociente(double cociente) {
        this.cociente = cociente;
    }
    

}
