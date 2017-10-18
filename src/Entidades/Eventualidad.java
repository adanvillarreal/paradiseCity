package Entidades;

import java.util.Date;

public class Eventualidad {

    private String encargado;
    private String descripcion;
    private String residente;
    private Date fechaDeEventualidad;

    public Eventualidad(String encargado, String descripcion, String residente) {
        this.encargado = encargado;
        this.descripcion = descripcion;
        this.residente = residente;
        this.fechaDeEventualidad = fechaDeEventualidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getResidente() {
        return residente;
    }

    public void setResidente(String residente) {
        this.residente = residente;
    }

    public Date getFechaDeEventualidad() {
        return fechaDeEventualidad;
    }

    public void setFechaDeEventualidad(Date fechaDeEventualidad) {
        this.fechaDeEventualidad = fechaDeEventualidad;
    }
}
