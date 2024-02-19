package Eje5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto> productos = new ArrayList<>();
        int ingresos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cantidad productos a ingresar"));

        for (int i = 0; i <= ingresos; i++) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del Producto"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del Producto");
            String tipo = JOptionPane.showInputDialog("Ingrese el Tipo del Producto\nLACTEO,CARNICO,FRUTA,ENLATADO");
            int anoExpiracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año de Expiracion del Producto"));
            int mesExpiracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes de Expiracion del Producto"));
            int diaExpiracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Dia de Expiracion del Producto"));
            String fabricante = JOptionPane.showInputDialog("Ingrese el fabricante del Producto");
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Producto"));
            double precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del Producto"));

            switch (tipo) {
                case "LACTEO" ->
                    productos.add(new Producto(codigo, nombre, TipoProducto.LACTEO, LocalDate.of(anoExpiracion, mesExpiracion, diaExpiracion),
                             fabricante, cantidad, precio));
                case "CARNICO" ->
                    productos.add(new Producto(codigo, nombre, TipoProducto.CARNICO, LocalDate.of(anoExpiracion, mesExpiracion, diaExpiracion),
                             fabricante, cantidad, precio));
                case "FRUTA" ->
                    productos.add(new Producto(codigo, nombre, TipoProducto.FRUTA, LocalDate.of(anoExpiracion, mesExpiracion, diaExpiracion),
                             fabricante, cantidad, precio));
                case "ENLATADO" ->
                    productos.add(new Producto(codigo, nombre, TipoProducto.ENLATADO, LocalDate.of(anoExpiracion, mesExpiracion, diaExpiracion),
                             fabricante, cantidad, precio));
                default -> {
                    System.out.println("TIpo incorrecto");
                }

            }

        }
        String nombreTienda = JOptionPane.showInputDialog("Ingrese el nombre de la Tienda");
        String direccionTienda = JOptionPane.showInputDialog("Ingrese la direccion de la Tienda");
        String telefonoTienda = JOptionPane.showInputDialog("Ingrese la direccion de la Tienda");
        // Crear la tienda y asignarle los productos
        Tienda tienda = new Tienda(nombreTienda, direccionTienda,telefonoTienda, productos);

        System.out.println(tienda.toString());
        // Aquí podrías llamar a métodos de `Tienda` para agregar o eliminar productos, etc.
    }
}
