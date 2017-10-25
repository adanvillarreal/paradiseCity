package Entidades;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.mapdb.DB;
import com.thoughtworks.xstream.*;
@XStreamAlias("message")
public class Recordatorio {
    @XStreamAlias("type")
    private int diasFaltantes;
    @XStreamAlias("type")
    private boolean status;

    public Recordatorio(int diasFaltantes, boolean status) {
        this.diasFaltantes = diasFaltantes;
        this.status = status;
    }

    public int getDiasFaltantes() {
        return diasFaltantes;
    }

    public void setDiasFaltantes(int diasFaltantes) {
        this.diasFaltantes = diasFaltantes;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}