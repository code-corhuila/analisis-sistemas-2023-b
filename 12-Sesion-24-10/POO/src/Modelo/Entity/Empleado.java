/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

import Modelo.Abstract.Auditoria;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author ariel
 */
public class Empleado extends Auditoria{
    private LocalDateTime fechaIngreso;
    private BigDecimal salario;
    private Persona persona;

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }    

    @Override
    public void Crear() {
        System.out.println("Agregar empleado");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar empleado");
    }

    @Override
    public void Eliminar() {
        System.out.println("Elimianr empleado");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar empleado");
    }
}
