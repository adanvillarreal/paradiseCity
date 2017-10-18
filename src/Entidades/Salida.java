package Entidades;

import javafx.util.Pair;

import java.util.Date;

public class Salida {
    private Pair<Date, Date> fechas;
    private String tipo;

    public Salida(Pair<Date, Date> fechas, String tipo) {
        fechas = fechas;
        this.tipo = tipo;
    }

    public Pair<Date, Date> getFechas() {
        return fechas;
    }

    public void setFechas(Pair<Date, Date> fechas) {

        this.fechas = fechas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}