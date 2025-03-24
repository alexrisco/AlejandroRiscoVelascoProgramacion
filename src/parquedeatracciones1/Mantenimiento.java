/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquedeatracciones1;

/**
 *
 * @author alejandro.risco
 */
public class Mantenimiento extends Empleado {
    private String areaResponsable;

    public Mantenimiento(String nombre, int idEmpleado, String puesto) {
        super(nombre, idEmpleado, puesto);
        this.areaResponsable = areaResponsable;
    }

    public String getAreaResponsable() { return areaResponsable; }
    public void setAreaResponsable(String areaResponsable) {
        if (!areaResponsable.equals("Mecánica") && !areaResponsable.equals("Eléctrica") && !areaResponsable.equals("Estructura")) {
            throw new IllegalArgumentException("Área responsable inválida.");
        }
        this.areaResponsable = areaResponsable;
    }
 public void realizaMantenimiento() {
            System.out.println(getNombre() + "esta haciendo el mantenimiento en" + areaResponsable);
        } 
  public void reportarProblema() {
            System.out.println(getNombre() + "Ha encontrado un problema en" +areaResponsable);
        } 
    @Override
    public String toString() {
        return "Mantenimiento{" +
                "nombre='" + getNombre() + '\'' +
                ", idEmpleado=" + getIdEmpleado() +
                ", puesto='" + getPuesto() + '\'' +
                ", areaResponsable='" + areaResponsable + '\'' +
                '}';
    }
}

    

