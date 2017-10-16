import com.sun.istack.internal.Nullable;
import javafx.util.Pair;

import java.util.*;

public class Residente {
    private String nombre;
    private Date fechaDeNacimiento;
    private int numCuarto;
    private int numCama;
    @Nullable
    private Date fechaDefuncion;
    private String servicioEmergencia;
    private String numSeguro;
    private Map<String, String> contactos = new HashMap<>();
    private List<String> condiciones = new ArrayList<>();
    //TODO(@adanvillarreal, @javier96): Los siguientes atributos son de clases pendientes
    private List<ProductoGen> productos;
    private List<Incidente> incidentes;
    //TODO(@adanvillarreal): Investigar si es la manera adecuada de representar salidas

    public Residente(String nombre, Date fechaDeNacimiento, int numCuarto, int numCama, Date fechaDefuncion, String servicioEmergencia, String numSeguro) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.numCuarto = numCuarto;
        this.numCama = numCama;
        this.fechaDefuncion = null;
        this.servicioEmergencia = servicioEmergencia;
        this.numSeguro = numSeguro;
    }

    private Map<Pair<Date, Date>, String> salidas = new HashMap<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getNumCuarto() {
        return numCuarto;
    }

    public void setNumCuarto(int numCuarto) {
        this.numCuarto = numCuarto;
    }

    public int getNumCama() {
        return numCama;
    }

    public void setNumCama(int numCama) {
        this.numCama = numCama;
    }

    public Date getFechaDefuncion() {
        return fechaDefuncion;
    }

    public void setFechaDefuncion(Date fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }

    public String getServicioEmergencia() {
        return servicioEmergencia;
    }

    public void setServicioEmergencia(String servicioEmergencia) {
        this.servicioEmergencia = servicioEmergencia;
    }

    public String getNumSeguro() {
        return numSeguro;
    }

    public void setNumSeguro(String numSeguro) {
        this.numSeguro = numSeguro;
    }

    public Map<String, String> getContactos() {
        return contactos;
    }

    public void addContacto(String contacto, String telefono) { this.contactos.put(contacto, telefono); }

    public void setContactos(Map<String, String> contactos) {
        this.contactos = contactos;
    }

    public List<String> getCondiciones() {
        return condiciones;
    }

    public List<String> addCondicion(String condicion) { this.condiciones.add(condicion); }

    public void setCondiciones(List<String> condiciones) {
        this.condiciones = condiciones;
    }

    public List<ProductoGen> getProductos() {
        return productos;
    }

    public void setProductos(List<ProductoGen> productos) {
        this.productos = productos;
    }

    public List<Incidente> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(List<Incidente> incidentes) {
        this.incidentes = incidentes;
    }

    public Map<Pair<Date, Date>, String> getSalidas() {
        return salidas;
    }

    public void setSalidas(Map<Pair<Date, Date>, String> salidas) {
        this.salidas = salidas;
    }
}