package Eje2;

public class Reloj {

    private int hora;
    private int segundos;
    private int minutos;

    public Reloj(int h, int s, int m) {
        this.hora = h;
        this.segundos = s;
        this.minutos = m;
    }
    public void consultarLaHora(){
        System.out.println(hora+":"+minutos+":"+segundos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    

}
