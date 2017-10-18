package Entidades;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.Date;

public class Medicina extends ProductoGenerico{
    private ArrayList<Boolean> Dosis = new ArrayList<>(3);
    private String precauciones;
    @Nullable
    private int duracionDias;
    private Date fechaDeCaducidad;

    public Medicina(String nombre, String descripcion, int cantidad, String precauciones, int duracionDias, Date fechaDeCaducidad) {
        super(nombre, descripcion, cantidad);
        this.precauciones = precauciones;
        this.duracionDias = duracionDias;
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public void modifyDosis(int i, boolean status){
        Dosis.set(i, status);
    }

    public ArrayList<Boolean> getDosis() {
        return Dosis;
    }

    public void setDosis(ArrayList<Boolean> dosis) {
        Dosis = dosis;
    }

    public String getPrecauciones() {
        return precauciones;
    }

    public void setPrecauciones(String precauciones) {
        this.precauciones = precauciones;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(Date fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }
}
