/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquedeatracciones1;
import java.util.Scanner;
/**
 *
 * @author alejandro.risco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ParqueDeAtracciones parque = new ParqueDeAtracciones();
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("*--- Menú del Parque de Atracciones ---*");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Atraccion");
            System.out.println("3. Agregar Visitante");
            System.out.println("4. Mostrar Información del Parque");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

                switch (opcion) {
                    case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingrese el ID del empleado: ");
                    int idEmpleado = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.print("Ingrese el puesto (Mantenimiento/Vendedor/Security): ");
                    String puesto = scanner.nextLine();

                    if (puesto.equalsIgnoreCase("Mantenimiento")) {
                        System.out.print("Ingrese el área de responsabilidad: ");
                        String areaResponsable = scanner.nextLine();
                        parque.agregarEmpleado(new Mantenimiento(nombreEmpleado, idEmpleado, areaResponsable));
                    } else if (puesto.equalsIgnoreCase("Vendedor")) {
                        parque.agregarEmpleado(new Vendedor(nombreEmpleado, idEmpleado));
                    } else {
                        parque.agregarEmpleado(new Empleado(nombreEmpleado, idEmpleado, puesto));
                    }
                    break;

                    case 2:
                         System.out.print("Ingrese el nombre de la atracción: ");
                    String nombreAtraccion = scanner.nextLine();
                    System.out.print("Ingrese la capacidad de la atracción: ");
                    int capacidad = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea

                    System.out.print("Ingrese el estado de la atracción (Operativa/En Mantenimiento/Fuera de Servicio): ");
                    String estado = scanner.nextLine();

                    parque.agregarAtraccion(new Atraccion(nombreAtraccion, capacidad, estado));
                    break;

                    case 3:
                        System.out.print("Ingrese el nombre del visitante: ");
                    String nombreVisitante = scanner.nextLine();
                    System.out.print("Ingrese el ID del visitante: ");
                    int idVisitante = scanner.nextInt();
                    System.out.print("Ingrese la edad del visitante: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();  // Consumir el salto de línea

                    parque.agregarVisitante(new Visitante(nombreVisitante, idVisitante, edad));
                    break;

                    case 4:
                        parque.mostrarInformacionParque();
                        break;
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.");
                }
            } 
    }
}


    
    

