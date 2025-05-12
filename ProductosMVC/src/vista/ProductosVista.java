/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;
import java.util.List;
import java.util.Scanner;
import modelo.Producto;
/**
 *
 * @author alejandro.risco
 */
public class ProductosVista {
    private Scanner scanner;

    public ProductosVista() {
        scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("\n--- MENÚ PRODUCTOS ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     *
     * @return
     */
    public Producto capturarProducto() {
        System.out.println("\n--- AGREGAR PRODUCTO ---");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(scanner.nextLine());

        return new Producto(nombre, precio, cantidad);
    }   


    /**
     *
     * @param productos
     */
    public void mostrarProductos(List<Producto> productos) {
        System.out.println("\n--- LISTA DE PRODUCTOS ---");
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println("ID: " + p.getId() +
                                   ", Nombre: " + p.getNombre() +
                                   ", Precio: $" + p.getPrecio() +
                                   ", Cantidad: " + p.getCantidad());
            }
        }
    }

    public int capturarId() {
        System.out.print("\nIngrese el ID del producto: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int obtenerOpcion() {
        return Integer.parseInt(scanner.nextLine());
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
