/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquedeatracciones1;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro.risco
 */
public class ParqueDeAtracciones {

    private List<Atraccion> listaAtracciones;
    private List<Empleado> listaEmpleados;
    private List<Visitante> listaVisitantes;

    public ParqueDeAtracciones() {
        this.listaAtracciones = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaVisitantes = new ArrayList<>();
    }

    public void agregarAtraccion(Atraccion atraccion) {
        this.listaAtracciones.add(atraccion);
    }

    public void agregarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }

    public void agregarVisitante(Visitante visitante) {
        this.listaVisitantes.add(visitante);
    }

    public void mostrarInformacionParque() {
        System.out.println("--- Información del Parque de Atracciones ---");
        System.out.println("Atracciones:");
        for (Atraccion atraccion : listaAtracciones) {
            System.out.println(atraccion);
        }
        System.out.println("\nEmpleados:");
        for (Empleado empleado : listaEmpleados) {
            System.out.println(empleado);
        }
        System.out.println("\nVisitantes:");
        for (Visitante visitante : listaVisitantes) {
            System.out.println(visitante);
        }
    }

   
}

    

