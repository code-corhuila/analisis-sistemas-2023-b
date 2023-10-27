/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Modelo.Entity.Empleado;
import Modelo.Entity.Persona;
import Modelo.Entity.Venta;

/**
 *
 * @author ariel
 */
public class Ejecutar {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Empleado empleado = new Empleado();
        persona.Crear();
        empleado.Crear();
        
        Venta venta = new Venta();
        venta.getCliente().getPersona().
        
            
    }
}
