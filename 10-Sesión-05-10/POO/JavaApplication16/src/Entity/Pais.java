/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.time.LocalDate;

/**
 *
 * @author ariel
 */
public class Pais{

    private String nombre;
    private Boolean estado;
    private LocalDate fechaCracion;
    private LocalDate fechaModificacion;
    private LocalDate fechaEliminacion;
    private Continente contiente;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaCracion() {
        return fechaCracion;
    }

    public void setFechaCracion(LocalDate fechaCracion) {
        this.fechaCracion = fechaCracion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public LocalDate getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(LocalDate fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public Continente getContiente() {
        return contiente;
    }

    public void setContiente(Continente contiente) {
        this.contiente = contiente;
    }  

}
