/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productosmvc;
import controlador.ProductoControlador;
import modelo.ProductoDAO;
import vista.ProductosVista;
/**
 *
 * @author alejandro.risco
 */
public class ProductosMVC {
    public static void main(String[] args) {
        // Inicialización del patrón MVC
        ProductoDAO modelo = new ProductoDAO();
        ProductosVista vista = new ProductosVista();
        ProductoControlador controlador = new ProductoControlador(modelo, vista);

        // Iniciar la aplicación
        controlador.iniciar();
    }

}

