/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Entity;

import Modelo.Abstract.Auditoria;
import java.time.LocalDateTime;

/**
 *
 * @author ariel
 */
public class Venta extends Auditoria{
    private LocalDateTime fecha;
    private String codigo;
    private Empleado empleado;
    private Cliente cliente;
    
    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void Crear() {
        System.out.println("Agregar venta");
    }

    @Override
    public void Modificar() {
        System.out.println("Modificar venta");
    }

    @Override
    public void Eliminar() {
        System.out.println("Eliminar venta");
    }

    @Override
    public void Consultar() {
        System.out.println("Consultar venta");
    }
    
}
