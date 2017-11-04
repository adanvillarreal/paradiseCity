import Entidades.Eventualidad;
import Entidades.Reporte;
import Entidades.Residente;
import Utils.EntidadSerializableUtils;
import Entidades.Recordatorio;

import com.thoughtworks.xstream.io.xml.StaxDriver;
import org.mapdb.*;
import com.thoughtworks.xstream.XStream;
import org.mapdb.DBMaker;
import Utils.BDUtils;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.*;
import java.util.concurrent.ConcurrentMap;

public class main {
    private static void reporteTurno(Date fecha) {
        BDUtils db = new BDUtils("reportes.db");
        String a = (String)db.getObject(fecha.toString());

        Reporte b = (Reporte) EntidadSerializableUtils.getEntidadFromXml(a);


        db.closeDB();
    }

    private static void consultaDias(int x){
        BDUtils db = new BDUtils("residente.db");
        String nombreResidente = "", medicamento = "";
        int diasFaltantes = 0;

        //iterar sobre el mapa
        //para cada elemento en residente, y para cada elemento de la lista de producto generico de ese residente
        //extrar nombreResidente, medicamento, diasFaltantes
        System.out.println(nombreResidente + " " + medicamento + " " + diasFaltantes);
        db.closeDB();
    }

    public static void main(String[] args) throws IOException {

        //Residente res = new Residente("Javier De la Garza", new Date(100,1,1), 2, 3, new Date(101,1,1), "666", "123", 1);



        /*
        BDUtils db = new BDUtils("residente.db");
        BDUtils db = new BDUtils("reportes.db");
        System.out.println((String)db.getObject("1"));
        Eventualidad eventualidad = new Eventualidad("Adan", "a", "Javier", new Date(8,5,5));
        System.out.println(db.size());
        String a = (String)db.getObject(new Date(9,5,5).toString());
        Eventualidad b = (Eventualidad) EntidadSerializableUtils.getEntidadFromXml(a);
        db.closeDB();
        */

        /*
        Eventualidad eve = new Eventualidad("Adan", "a", "Residente1", new Date(8,5,5));
        eve = new Eventualidad("Adan", "a", "Residente2", new Date(8,6,5));
        eve = new Eventualidad("Adan", "a", "Residente3", new Date(8,6,5));
        eve = new Eventualidad("Adan", "a", "Residente4", new Date(8,5,5));
        eve = new Eventualidad("Adan", "a", "Residente5", new Date(8,5,5));
        eve = new Eventualidad("Adan", "a", "Residente6", new Date(8,5,5));
        eve = new Eventualidad("Adan", "a", "Residente7", new Date(8,5,5));
        */

    }
}
