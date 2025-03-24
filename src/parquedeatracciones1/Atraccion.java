/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parquedeatracciones1;

/**
 *
 * @author alejandro.risco
 */
public class Atraccion {
   private String nombre;
    private int capacidad;
    private String estado;

    // Constructor de la clase Atraccion
    public Atraccion(String nombre, int capacidad1, String tipo) {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    // Métodos getter y setter para cada atributo
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getcapacidad() { return capacidad; }
    public void setcapacidad(int capacidad) { this.capacidad = capacidad; }


    public String getEstado() { return estado; }
    public void setEstado(String estado) {
        if (!estado.equals("Operativa") && !estado.equals("En mantenimiento") && !estado.equals("Cerrada")) {
            throw new IllegalArgumentException("Estado inválido.");
        }
        this.estado = estado;
    }
    
   public void iniciarAtraccion() {
            System.out.println(nombre + "Se esta Iniciando" );
        } 
        
        public void detenerAtraccion(){
            System.out.println(nombre + "Se  ha detenido" );
        }
        
        public void cambiarEstado(String nuevoEstado){
            estado = nuevoEstado;
            System.out.println("El estado de esta atraccion es ahora" +estado);
        }
    // Método toString para representar el objeto como una cadena
    @Override
    public String toString() {
        return "Atraccion{" +
                "nombre='" + nombre + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

    
    
    

