/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

import Modelo.Abstract.Auditoria;

/**
 *
 * @author ariel
 */
public class Persona extends Auditoria{
    
    private String nombre; 
    private String apellido;
    private Byte edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Byte getEdad() {
        return edad;
    }

    public void setEdad(Byte edad) {
        this.edad = edad;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar persona");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar Persona");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr persona");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar persona");
    }
    
}
