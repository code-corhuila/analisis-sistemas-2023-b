/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Abstract;

import Modelo.Interface.Accion;
import java.time.LocalDateTime;

/**
 *
 * @author ariel
 */
public abstract class Auditoria implements Accion{
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private Boolean state;
    private Long createdUser;
    private Long udpatedUser;
    private Long deletedUser;

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Long getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(Long createdUser) {
        this.createdUser = createdUser;
    }

    public Long getUdpatedUser() {
        return udpatedUser;
    }

    public void setUdpatedUser(Long udpatedUser) {
        this.udpatedUser = udpatedUser;
    }

    public Long getDeletedUser() {
        return deletedUser;
    }

    public void setDeletedUser(Long deletedUser) {
        this.deletedUser = deletedUser;
    }    
}
