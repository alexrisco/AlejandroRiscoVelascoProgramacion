/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquedeatracciones1;

/**
 *
 * @author alejandro.risco
 */
public class Vendedor extends Empleado {

    private int ventasRealizadas;

    public Vendedor (String nombre, int idEmpleado) {
        super(nombre, idEmpleado,"Vendedor" );
        this.ventasRealizadas = 0;
    }


 public void venderEntrada() {
            System.out.println(getNombre()+ "Ha conseguido vender la entrada" );
            
        } 
  public void reportarEntrada() {
            System.out.println(getNombre() + "Ha realizp" +ventasRealizadas);
        } 
    @Override
    public String toString() {
        return "Operador{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getIdEmpleado() +
                ", puesto='" + getPuesto() + '\'' +
                '}';
    }
}


