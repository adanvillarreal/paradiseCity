package Entidades;

public class Recordatorio {

    private int diasFaltantes;
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