package Entidades;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@XStreamAlias("message")
public class Reporte {
    @XStreamAlias("type")
    private Date date;
    @XStreamAlias("type")
    private List<Eventualidad> eventualidads = new ArrayList<>();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Eventualidad> getEventualidads() {
        return eventualidads;
    }

    public void setEventualidads(List<Eventualidad> eventualidads) {
        this.eventualidads = eventualidads;
    }

    public Reporte(Date date, List<Eventualidad> eventualidads) {
        this.date = date;
        this.eventualidads = eventualidads;
    }

    public void addEventualidad(Eventualidad eventualidad){
        this.eventualidads.add(eventualidad);

    }
}
