package Entidades;

import Utils.BDUtils;
import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XStreamAlias("message")
public class Eventualidad {
    @XStreamAlias("type")
    private String encargado;
    @XStreamAlias("type")
    private String descripcion;
    @XStreamAlias("type")
    private String residente;
    @XStreamAlias("type")
    private Date fechaDeEventualidad;

    public Eventualidad(String encargado, String descripcion, String residente, Date fechaDeEventualidad) {
        this.encargado = encargado;
        this.descripcion = descripcion;
        this.residente = residente;
        this.fechaDeEventualidad = fechaDeEventualidad;
        insertToMap();
    }

    private void insertToMap(){
        BDUtils db = new BDUtils("reportes.db");
        Reporte reporte = (Reporte)db.getObject(this.fechaDeEventualidad.toString());
        if(reporte == null)
            reporte = new Reporte(this.fechaDeEventualidad, new ArrayList<Eventualidad>());
        reporte.addEventualidad(this);
        db.replaceObject(this.fechaDeEventualidad.toString(), reporte);
        db.closeDB();
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
