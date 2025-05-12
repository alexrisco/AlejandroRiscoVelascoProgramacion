
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.ProductoDAO;
import modelo.Producto;
import vista.ProductosVista;

public class ProductoControlador {

    private ProductoDAO modelo;
    private ProductosVista vista;

    public ProductoControlador(ProductoDAO modelo, ProductosVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public ProductoControlador(ProductosVista pv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

public void iniciar() {
    int opcion;
    do {
        vista.mostrarMenu();
        opcion = vista.obtenerOpcion();

        switch (opcion) {
            case 1:
                agregarProducto();
                break;
            case 2:
                mostrarProductos();
                break;
            case 3:
                actualizarProducto();
                break;
            case 4:
                eliminarProducto();
                break;
            case 5:
                vista.mostrarMensaje("Saliendo del sistema...");
                break;
            default:
                vista.mostrarMensaje("Opción no válida");
        }
    } while (opcion != 5);
}

private void agregarProducto() {
    Producto producto = vista.capturarProducto();
    if (modelo.crearProducto(producto)) {
        vista.mostrarMensaje("Producto agregado con éxito");
    } else {
        vista.mostrarMensaje("Error al agregar el producto");
    }
}

private void mostrarProductos() {
    List<Producto> productos = modelo.obtenerProductos();
    vista.mostrarProductos(productos);
}

private void actualizarProducto() {
    vista.mostrarProductos(modelo.obtenerProductos());
    int id = vista.capturarId();
    Producto producto = vista.capturarProducto();
    producto.setId(id);

    if (modelo.actualizarProducto(producto)) {
        vista.mostrarMensaje("Producto actualizado con éxito");
    } else {
        vista.mostrarMensaje("Error al actualizar el producto");
    }
}

private void eliminarProducto() {
    vista.mostrarProductos(modelo.obtenerProductos());
    int id = vista.capturarId();

    if (modelo.eliminarProducto(id)) {
        vista.mostrarMensaje("Producto eliminado con éxito");
    } else {
        vista.mostrarMensaje("Error al eliminar el producto");
    }
}
}