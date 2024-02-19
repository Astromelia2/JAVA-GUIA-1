package Eje5;

import java.util.List;

public class Tienda {

    private String nombre;
    private String direccion;
    private String telefono;
    private List<Producto> productos; // Lista de productos

    public Tienda(String nombre, String direccion, String telefono, List<Producto> productos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.productos = productos;
    }

    // Métodos para acceder y modificar la lista de productos
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public boolean eliminarProducto(Producto producto) {
        return this.productos.remove(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Tienda: ").append(nombre)
                .append("\nDireccion: ").append(direccion)
                .append("\nTelefono: ").append(telefono)
                .append("\nProductos:\n");

        for (Producto producto : productos) {
            builder.append(producto.toString()).append("\n");
        }

        return builder.toString();
    }

}
