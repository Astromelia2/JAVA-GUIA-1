package Eje5;

import java.time.LocalDate;

public class Producto {

    private int codigoNumerico;
    private String nombre;
    private TipoProducto tipo; // Enum para los tipos de productos
    private LocalDate fechaExpiracion;
    private String nombreFabricante;
    private int cantidadInventario;
    private double precioUnitario;

    public Producto(int codigoNumerico, String nombre, TipoProducto tipo, LocalDate fechaExpiracion,
            String nombreFabricante, int cantidadInventario, double precioUnitario) {
        this.codigoNumerico = codigoNumerico;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaExpiracion = fechaExpiracion;
        this.nombreFabricante = nombreFabricante;
        this.cantidadInventario = cantidadInventario;
        this.precioUnitario = precioUnitario;
    }

    public int getCodigoNumerico() {
        return codigoNumerico;
    }

    public void setCodigoNumerico(int codigoNumerico) {
        this.codigoNumerico = codigoNumerico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNombreFabricante() {
        return nombreFabricante;
    }

    public void setNombreFabricante(String nombreFabricante) {
        this.nombreFabricante = nombreFabricante;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Producto{"
                + "codigoNumerico=" + codigoNumerico
                + ", nombre='" + nombre + '\''
                + ", tipo=" + tipo
                + ", fechaExpiracion=" + fechaExpiracion
                + ", nombreFabricante='" + nombreFabricante + '\''
                + ", cantidadInventario=" + cantidadInventario
                + ", precioUnitario=" + precioUnitario
                + '}';
    }

}

// Enum para definir los tipos de productos
enum TipoProducto {
    LACTEO, CARNICO, FRUTA, ENLATADO
}
