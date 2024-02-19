package Eje4;

public class Proyectil {
    private double angulo;
    private double velocidad;
    private double alcance;

    public Proyectil(double angulo, double velocidad) {
        this.angulo = angulo;
        this.velocidad = velocidad;
    }

    public double getAngulo() {
        return angulo;
    }

    public void setAngulo(double angulo) {
        this.angulo = angulo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    public void alcance(){
        alcance=(Math.pow(velocidad, 2) * Math.sin(2 * angulo)) / 9.8;
        System.out.println("El alcance del proyectil es: "+ alcance);
    }
}
